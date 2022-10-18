package com.iassoftware.calculadorahorastrabajadas.repository;

import com.iassoftware.calculadorahorastrabajadas.model.ReportModel;
import org.springframework.data.repository.CrudRepository;

public interface IReportRepository extends CrudRepository<ReportModel, Long> {
}
