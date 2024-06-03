<h1>HTML2PDF</h1>


<h3> 
<p>
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
</p>
</h3>
