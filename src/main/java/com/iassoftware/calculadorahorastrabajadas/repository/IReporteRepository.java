package com.iassoftware.calculadorahorastrabajadas.repository;

import com.iassoftware.calculadorahorastrabajadas.model.ReporteModel;
import org.springframework.data.repository.CrudRepository;

public interface IReporteRepository extends CrudRepository<ReporteModel, Integer> {
}
