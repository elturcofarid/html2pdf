package com.tools.html2pdf.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

public interface Html2PdfService {

     ResponseEntity<byte[]> convertHtmlToPdf(String htmlContent);

     ResponseEntity<byte[]> convertHtmlToPdf(MultipartFile file) ;

}
