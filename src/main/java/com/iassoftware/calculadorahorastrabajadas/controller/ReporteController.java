package com.iassoftware.calculadorahorastrabajadas.controller;

import com.iassoftware.calculadorahorastrabajadas.model.ReporteModel;
import com.iassoftware.calculadorahorastrabajadas.service.IReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reporte")
public class ReporteController {
    @Autowired
    private IReporteService ireporteService;

    @PostMapping()
    public void Crear(@RequestBody ReporteModel reporte) {
        this.ireporteService.Crear(reporte);
    }
}
