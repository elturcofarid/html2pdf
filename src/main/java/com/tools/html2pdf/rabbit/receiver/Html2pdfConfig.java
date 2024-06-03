package com.tools.html2pdf.rabbit.receiver;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@Component("html2pdf")
public class Html2pdfConfig {

	
  
    @Bean
    public Html2PdfReceiver receive() {
	return new Html2PdfReceiver();
    }
    
   
	}