package com.csti.capacitacion.service;

import com.csti.capacitacion.entity.Pais;

import java.util.List;

public interface PaisService {

    List<Pais> getAll();

    // Create
    Pais createPais(Pais pais);

    // Update
    Pais updatePais(Pais pais);
}