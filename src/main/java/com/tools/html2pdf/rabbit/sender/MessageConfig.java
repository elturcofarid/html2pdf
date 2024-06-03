package com.tools.html2pdf.rabbit.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MessageConfig {

    @Bean
    public MessageSender sender() {
        return new MessageSender();
    }

}
