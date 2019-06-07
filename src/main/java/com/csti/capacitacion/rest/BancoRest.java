package com.csti.capacitacion.rest;

import com.csti.capacitacion.entity.Bancos;
import com.csti.capacitacion.util.PortalException;
import com.csti.capacitacion.repository.BancoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "banco")
public class BancoRest {

    @Autowired
    private BancoRepository bancoRepository;


    @RequestMapping(value = "findAll",  method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})

    public ResponseEntity<List<Bancos>> getListaBanco() throws PortalException {
        List listaBanco = this.bancoRepository.findAll();
        return ResponseEntity.ok().body(listaBanco);
    }





}

