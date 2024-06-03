package com.tools.html2pdf.rabbit.sender;

import com.google.gson.Gson;
import com.tools.html2pdf.model.DataRequest;
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

	@Autowired
	private RabbitTemplate template;

	@Autowired
	private Gson gson;

	public void send(DataRequest message) {
		this.template.convertAndSend(message.getQueue(), gson.toJson(message.getData()));
	}

}
