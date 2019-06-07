package com.csti.capacitacion.rest;


import com.csti.capacitacion.entity.Ubigeo;
import com.csti.capacitacion.repository.UbigeoRepository;
import com.csti.capacitacion.util.PortalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "ubigeo")
public class UbigeoRest {
    @Autowired
    private UbigeoRepository ubigeoRepository;

    @RequestMapping(value = "findAll",  method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Ubigeo>> getListaUbigeo() throws PortalException {
        List listaUbigeo = this.ubigeoRepository.findAll();
        return ResponseEntity.ok().body(listaUbigeo);
    }
}
