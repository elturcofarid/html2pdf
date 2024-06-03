package com.onlysystems.indicadores.service;

import com.onlysystems.indicadores.modelo.RegistrosModel;
import com.onlysystems.indicadores.modelo.TickectClientes;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface IndicadoresServices {

    String consultarDatosxfechas(List<RegistrosModel> registro);

    Map<String, Long> consultaRequerimientosClientesAll();
}
