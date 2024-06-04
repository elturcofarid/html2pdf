package com.tools.html2pdf.rabbit.receiver;

import com.google.gson.Gson;
import com.tools.html2pdf.model.DataRequest;
import com.tools.html2pdf.rabbit.sender.MessageSender;
import com.tools.html2pdf.service.Html2PdfService;
import com.tools.html2pdf.service.Html2PdfServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Html2PdfReceiver {

	@Autowired
	private Gson gson;

	@Autowired
	private Html2PdfService html2PdfService;

	@Autowired
	private MessageSender messageSender;

	private static Logger LOGGER = LoggerFactory.getLogger(Html2PdfReceiver.class);

	@RabbitListener(queues = "${queue.html2pdf}")
	public void receive(String in) {

		DataRequest data = new DataRequest();

		try {
			 data = gson.fromJson(in, DataRequest.class);
			try {
				messageSender.send(new DataRequest(html2PdfService.convertHtmlToPdfText(data.getData().toString()), data.getQueue()));
			} catch (Exception e) {
				LOGGER.error("Ha ocurrido un error al insertar mensaje en la cola ::: "+ data.getQueue() +" :::: "+ e.getMessage());
			}
		} catch (Exception e) {
			LOGGER.error("Ha ocurrido un error al recibir el mensaje en la cola ::: "+ e.getMessage());
			e.printStackTrace();
		}

	}
}
