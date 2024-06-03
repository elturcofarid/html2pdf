package com.tools.html2pdf.controller;

import com.google.gson.Gson;
import com.itextpdf.html2pdf.HtmlConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


@RestController
@RequestMapping("/tools")
@CrossOrigin(origins = "http://localhost:3000")
public class ToolsController {

    Gson gson = new Gson();

    @PostMapping("/convert")
        public ResponseEntity<byte[]> convertHtmlToPdf(@RequestBody String htmlContent) throws IOException {
        ByteArrayOutputStream target = new ByteArrayOutputStream();
        HtmlConverter.convertToPdf(new ByteArrayInputStream(htmlContent.getBytes()), target);

        byte[] bytes = target.toByteArray();

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=document.pdf");

        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(bytes);
    }

    @PostMapping("/convertFile")
     public ResponseEntity<byte[]> convertHtmlToPdf(@RequestParam("file") MultipartFile file) throws IOException {
        ByteArrayOutputStream target = new ByteArrayOutputStream();
         HtmlConverter.convertToPdf(file.getInputStream(), target);

        byte[] bytes = target.toByteArray();

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=document.pdf");

        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(bytes);
    }

    }





