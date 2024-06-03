package com.onlysystems.indicadores;

import com.onlysystems.indicadores.modelo.RegistrosModel;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivoCvs {


        public List<RegistrosModel> readCSV(String filePath) {
            List<RegistrosModel> registroList = new ArrayList<>();

            try (Reader reader = new FileReader(filePath);
                 CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {

                for (CSVRecord csvRecord : csvParser) {
                    RegistrosModel registro = new RegistrosModel();
                    // Acceder a los valores de cada columna por su índice
                    registro.setTicket(Integer.parseInt(csvRecord.get(1)));
                    registro.setCreado(Timestamp.valueOf(csvRecord.get(4)));
                    registro.setLast_changed(Timestamp.valueOf(csvRecord.get(5)));
                    registro.setFecha_cierre(csvRecord.get(6));
                    registro.setCola(csvRecord.get(7));
                    registro.setEstado(csvRecord.get(8));
                    registro.setAns(csvRecord.get(13));
                    registro.setTipoServicio(csvRecord.get(14));
                    registro.setPropietario(csvRecord.get(15));
                    //tiempo en el que debio ser resuelto
                    int s1, s2 =0;
                    s1 = Integer.parseInt(csvRecord.get(21));
                    s2 = Integer.parseInt(csvRecord.get(39));
                    registro.setTiempo_solucion(s1);
                    registro.setTiempo_real_solucion(s2);

                    if (s1 < 0 || s2 < 0){
                        registro.setCumplido(false);
                    }else{
                        registro.setCumplido(true);
                    }


                    registro.setEstado_final(csvRecord.get(48));
                    registro.setProceso(csvRecord.get(56));
                    registro.setActividad(csvRecord.get(57));
                    registro.setTicket_maestro(csvRecord.get(58)!=null?0:Integer.parseInt(csvRecord.get(58)));
                    registro.setCliente(csvRecord.get(74));
                    registro.setEstado_incidente(csvRecord.get(128));
                    registro.setAns_analisado(csvRecord.get(130));
                    registro.setMotivo_devolucion(csvRecord.get(146));

                    registro.setEstimacion_desarrollo(csvRecord.get(153)!=null?0:Integer.parseInt(csvRecord.get(153)));
                    registro.setEstimacion_pruebas(csvRecord.get(154).equals("")?0:Integer.parseInt(csvRecord.get(154)));
                    registro.setEstimacion_total(csvRecord.get(155)!=null?0:Integer.parseInt(csvRecord.get(155)));
                    registro.setFecha_inicio(csvRecord.get(156));
                    registro.setFecha_entrega_des(csvRecord.get(160));
                    registro.setFecha_entrega_pruebas(csvRecord.get(161));

                    registro.setCasos_prueba(csvRecord.get(164).equals("")?0:Integer.parseInt(csvRecord.get(164)));
                    registro.setBugs_alto(csvRecord.get(165).equals("")?0:Integer.parseInt(csvRecord.get(165)));
                    registro.setBugs_medio(csvRecord.get(166).equals("")?0:Integer.parseInt(csvRecord.get(166)));
                    registro.setBugs_bajo(csvRecord.get(167).equals("")?0:Integer.parseInt(csvRecord.get(167)));
                    registro.setBugs_reabiertos(csvRecord.get(169).equals("")?0:Integer.parseInt(csvRecord.get(169)));

                    registro.setCiclos(csvRecord.get(168).equals("")?0:Integer.parseInt(csvRecord.get(168)));

                    registro.setOla_incidente(csvRecord.get(256));

                    registro.setFecha_real_entrega_des(csvRecord.get(302).length()<10?"":csvRecord.get(302).substring(0,10));
                    registro.setFecha_real_entrega_pruebas(csvRecord.get(303).length()<10?"":csvRecord.get(303).substring(0,10));


                    registro.setDesarrollador(csvRecord.get(305));
                    registro.setTester(csvRecord.get(306));
                    registroList.add(registro);
                }

                System.out.println("Lectura de archivo CSV completada.");

            } catch (IOException e) {
                e.printStackTrace();
            }
            return registroList;
        }

}
