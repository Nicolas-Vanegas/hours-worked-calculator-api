package com.iassoftware.calculadorahorastrabajadas.service;

import com.iassoftware.calculadorahorastrabajadas.model.ReportModel;
import com.iassoftware.calculadorahorastrabajadas.repository.IReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService implements IReportService{

    @Autowired
    IReportRepository reportRepository;

    public ReportModel Create(ReportModel report) {
        return reportRepository.save(report);
    }
}
