package com.tools.html2pdf.controller;

import com.google.gson.Gson;
import com.itextpdf.html2pdf.HtmlConverter;
import com.tools.html2pdf.service.Html2PdfService;
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

    @Autowired
    private Html2PdfService html2PdfService;

    Gson gson = new Gson();

    @PostMapping("/convert")
        public ResponseEntity<byte[]> convertHtmlToPdf(@RequestBody String htmlContent) throws IOException {
        return html2PdfService.convertHtmlToPdf(htmlContent);
    }

    @PostMapping("/convertFile")
     public ResponseEntity<byte[]> convertHtmlToPdf(@RequestParam("file") MultipartFile file) throws IOException {
        return html2PdfService.convertHtmlToPdf(file);
    }

    }





