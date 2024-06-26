package com.tools.html2pdf.service;

import com.google.gson.Gson;
import com.itextpdf.html2pdf.HtmlConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Base64;

@Service
public class Html2PdfServiceImpl implements  Html2PdfService{

    private static Logger LOGGER = LoggerFactory.getLogger(Html2PdfServiceImpl.class);

    @Autowired
    private Gson gson;

    public ResponseEntity<byte[]> convertHtmlToPdfByte(String htmlContent)  {
        HttpHeaders headers = new HttpHeaders();
        ByteArrayOutputStream target = new ByteArrayOutputStream();
        byte[] bytes = new byte[0];

        try {
            HtmlConverter.convertToPdf(new ByteArrayInputStream(htmlContent.getBytes()), target);
            bytes = target.toByteArray();
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=document.pdf");
        }catch (Exception e){
            LOGGER.error("Ha ocurrido un error convirtiendo Html a pdf  (Texto) ::: " + e.getMessage());
        }
        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(bytes);
    }

    public String convertHtmlToPdfText(String htmlContent)  {

        ByteArrayOutputStream target = new ByteArrayOutputStream();
        byte[] bytes = new byte[0];

        try {
            HtmlConverter.convertToPdf(new ByteArrayInputStream(htmlContent.getBytes()), target);
            bytes = target.toByteArray();

        }catch (Exception e){
            LOGGER.error("Ha ocurrido un error convirtiendo Html a pdf  (Texto) ::: " + e.getMessage());
        }
        return  gson.toJson(Base64.getEncoder().encodeToString(bytes));
    }

    public ResponseEntity<byte[]> convertHtmlToPdf(MultipartFile file)  {
        ByteArrayOutputStream target = new ByteArrayOutputStream();
        byte[] bytes = new byte[0];
        HttpHeaders headers = new HttpHeaders();
    try{
        HtmlConverter.convertToPdf(file.getInputStream(), target);
        bytes = target.toByteArray();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=document.pdf");
    }catch (Exception e){
           LOGGER.error("Ha ocurrido un error convirtiendo Html a pdf (Archivo) ::: " + e.getMessage());
    }
        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(bytes);
    }
}
