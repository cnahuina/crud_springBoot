package com.csti.capacitacion.service.Imple;

import com.csti.capacitacion.entity.Pais;
import com.csti.capacitacion.service.PaisService;
import com.csti.capacitacion.repository.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaisServiceImple implements PaisService {
    private PaisRepository paisRepository;

    @Autowired
    public void setPaisRepository(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pais> getAll() {
        return this.paisRepository.findAll();
    }

    @Override
    public Pais updatePais(Pais pais) {
        return paisRepository.save(pais);
    }

    @Override
    public Pais createPais(Pais pais) {
        return paisRepository.save(pais);
    }
}
