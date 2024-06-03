<h1>HTML2PDF</h1>


<h4> 

Este servicio consta de dos metodos de conversión de HTML a PDF, utilizando la librería HTML2PDF, https://www.html2pdf.fr/es 
</br>
</br>
1. Convertir Html a PDF, metodo que recibe un String con el HTML en formato texto.

  Metodo: POST </br>
  endpoint: /tools/convert </br>
  Body: Html en formato texto </br>

</br>
</br>
2. Convertir Archivo HTML a PDF, metodo que recibe un File HTMl y lo convierte a PDF.

  Metodo: POST  </br>
  endpoint: /tools/convertFile </br>
  form-data: Parametro file, archivo HTML </br>

</br>
nota: este servicio también permite convertir un texto HTML a un archivo PDF, configurando el servicio para que escuche una cola en RabbitMQ con la siguiente estructura
</br>
</br>
{ </br>
	"data": "Html en texto", </br>
	"queue" : "cola a la que se reenviara el Archivo PDF" </br>
} </br>
</br>
</br>

</h4>


<h6>
Configuración del servicio:

en el archivo Aplication.properties agregar  la informacion de consumo de RabbitMQ

queue.html2pdf=html2pdf </br>

spring.rabbitmq.host=xxxxxxxxx  </br>
spring.rabbitmq.username=xxxxx  </br>
spring.rabbitmq.password=xxxx  </br>

</h6>
