package com.csti.capacitacion.rest;


import com.csti.capacitacion.entity.Pais;
import com.csti.capacitacion.service.Imple.PaisServiceImple;
import com.csti.capacitacion.util.PortalException;
import com.csti.capacitacion.repository.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value= "pais")
public class PaisRest {
    @Autowired
    private PaisRepository paisRepository;

    @RequestMapping(value = "findAll",  method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Pais>> getListaBanco() throws PortalException {
        List listaPais = this.paisRepository.findAll();
        return ResponseEntity.ok().body(listaPais);
    }

    @RequestMapping(value="/update", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Pais> update(@RequestBody Pais pais){

        try{
            Pais paisUpdate = this.paisRepository.save(pais);
            System.out.println(paisUpdate);
            return new ResponseEntity<>(paisUpdate, HttpStatus.OK);

        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="/create", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Pais> create(@RequestBody Pais pais){

        try{
            Pais paisCreate = this.paisRepository.save(pais);
            System.out.println(paisCreate);
            return new ResponseEntity<>(paisCreate, HttpStatus.OK);

        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
