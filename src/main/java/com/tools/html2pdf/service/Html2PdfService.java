package com.tools.html2pdf.service;

import com.itextpdf.html2pdf.HtmlConverter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public interface Html2PdfService {

     ResponseEntity<byte[]> convertHtmlToPdf(String htmlContent) throws IOException;

     ResponseEntity<byte[]> convertHtmlToPdf(MultipartFile file) throws IOException;

}
