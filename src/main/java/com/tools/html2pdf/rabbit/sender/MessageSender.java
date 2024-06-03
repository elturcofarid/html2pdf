package com.tools.html2pdf.rabbit.sender;

import com.google.gson.Gson;
import com.tools.html2pdf.model.DataRequest;
import com.tools.html2pdf.service.Html2PdfServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Clase que envia mensaje a la cola con el contenido
 * 
 * @author fureche
 *
 */
public class MessageSender {

	private static Logger LOGGER = LoggerFactory.getLogger(MessageSender.class);

	@Autowired
	private RabbitTemplate template;

	@Autowired
	private Gson gson;

	public void send(DataRequest message) {
		try {
			this.template.convertAndSend(message.getQueue(), gson.toJson(message.getData()));
		}catch (Exception e){
			LOGGER.error("Ha ocurrido un error al enviar el mensaje en la cola ::: "+ e.getMessage());
		}
	}

}
