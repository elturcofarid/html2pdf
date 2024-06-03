package com.onlysystems.indicadores.repository;

import com.onlysystems.indicadores.modelo.RegistrosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndicadoresRepository  extends JpaRepository<RegistrosModel, Integer> {

}
