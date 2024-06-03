package com.onlysystems.indicadores.service;

import com.onlysystems.indicadores.modelo.RegistrosModel;
import com.onlysystems.indicadores.modelo.TickectClientes;
import com.onlysystems.indicadores.repository.IndicadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class IndicadoresServicesImpl implements IndicadoresServices{

    @Autowired
    private IndicadoresRepository indicadoresRepository;

    @Override
    public String consultarDatosxfechas(List<RegistrosModel> registro){
        indicadoresRepository.saveAll(registro);
        return "esto es el servicio";
    }

    @Override
    public Map<String, Long> consultaRequerimientosClientesAll(){

        List<RegistrosModel> lista = indicadoresRepository.findAll().stream().filter(
                registro -> registro.getTipoServicio().equals("SERVICIO INTERNO")
        ).collect(Collectors.toList());

        return lista.stream()
                .collect(Collectors.groupingBy(RegistrosModel::getCliente, Collectors.counting()));
    }


}
