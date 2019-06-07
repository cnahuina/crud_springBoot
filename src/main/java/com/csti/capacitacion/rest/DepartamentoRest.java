package com.csti.capacitacion.rest;

import com.csti.capacitacion.entity.Departamento;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.csti.capacitacion.util.PortalException;
import com.csti.capacitacion.repository.DepartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "departamento")
public class DepartamentoRest {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    @RequestMapping(value = "findAll",  method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Departamento>> getListaDepartamento() throws PortalException {
        List listaDepartamento = this.departamentoRepository.findAll();
        return ResponseEntity.ok().body(listaDepartamento);
    }
}
