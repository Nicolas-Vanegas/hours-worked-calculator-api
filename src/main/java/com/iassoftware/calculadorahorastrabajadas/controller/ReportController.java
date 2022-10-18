package com.iassoftware.calculadorahorastrabajadas.controller;

import com.iassoftware.calculadorahorastrabajadas.model.ReportModel;
import com.iassoftware.calculadorahorastrabajadas.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ReportController {
    @Autowired
    private IReportService ireporteService;

    @PostMapping("/report")
    ReportModel Create(@RequestBody ReportModel report) {
        return this.ireporteService.Create(report);
    }
}
