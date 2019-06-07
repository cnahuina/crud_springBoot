package com.csti.capacitacion.service;

import com.csti.capacitacion.entity.Departamento;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DepartamentoService {
    List<Departamento> getAll();
}
