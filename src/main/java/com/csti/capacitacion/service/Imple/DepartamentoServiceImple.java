package com.csti.capacitacion.service.Imple;

import com.csti.capacitacion.entity.Departamento;
import com.csti.capacitacion.service.DepartamentoService;
import com.csti.capacitacion.repository.DepartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoServiceImple implements DepartamentoService {
    private DepartamentoRepository departamentoRepository;

    @Autowired
    public void setDepartamentoRepository(DepartamentoRepository paisRepository) {
        this.departamentoRepository = departamentoRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Departamento> getAll() {
        return this.departamentoRepository.findAll();
    }
}
