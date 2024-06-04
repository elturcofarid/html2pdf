package com.tools.html2pdf.controller;

import com.google.gson.Gson;
import com.tools.html2pdf.service.Html2PdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequestMapping("/tools")
public class ToolsController {

    @Autowired
    private Html2PdfService html2PdfService;

    @PostMapping("/convert")
        public ResponseEntity<byte[]> convertHtmlToPdf(@RequestBody String htmlContent) {
        return html2PdfService.convertHtmlToPdfByte(htmlContent);
    }

    @PostMapping("/convertText")
    public ResponseEntity<String> convertHtmlToPdfText(@RequestBody String htmlContent) {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=document.pdf");
        return ResponseEntity.ok()
                .body(html2PdfService.convertHtmlToPdfText(htmlContent));
    }

    @PostMapping("/convertFile")
     public ResponseEntity<byte[]> convertHtmlToPdf(@RequestParam("file") MultipartFile file)  {
        return html2PdfService.convertHtmlToPdf(file);
    }

}





