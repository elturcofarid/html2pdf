<h1>HTML2PDF</h1>


<h3> 
<p>
Este servicio consta de dos metodos de conversión de HTML a PDF, utilizando la librería HTML2PDF, https://www.html2pdf.fr/es 

1. Convertir Html a PDF, metodo que recibe un String con el HTML en formato texto.

  Metodo: POST </br>
  endpoint: /tools/convert
  Body: Html en formato texto


2. Convertir Archivo HTML a PDF, metodo que recibe un File HTMl y lo convierte a PDF.

  Metodo: POST 
  endpoint: /tools/convertFile
  form-data: Parametro file, archivo HTML

nota: este servicio también permite convertir un texto HTML a un archivo PDF, configurando el servicio para que escuche una cola en RabbitMQ con la siguiente estructura


{
	"data": "Html en texto",
	"queue" : "cola a la que se reenviara el Archivo PDF"
}


</p>
</h3>
