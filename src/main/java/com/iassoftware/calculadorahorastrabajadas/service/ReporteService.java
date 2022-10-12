package com.iassoftware.calculadorahorastrabajadas.service;

import com.iassoftware.calculadorahorastrabajadas.model.ReporteModel;
import com.iassoftware.calculadorahorastrabajadas.repository.IReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReporteService implements IReporteService{

    @Autowired
    IReporteRepository reporteRepository;

    public void Crear(ReporteModel reporte) {
        reporteRepository.save(reporte);
    }
}
