package com.csti.capacitacion.service.Imple;

import com.csti.capacitacion.entity.Ubigeo;
import com.csti.capacitacion.repository.UbigeoRepository;
import com.csti.capacitacion.service.UbigeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UbigeoServiceImple implements UbigeoService {
    private UbigeoRepository ubigeoRepository;

    @Autowired
    public void setUbigeoRepository(UbigeoRepository ubigeoRepository) {
        this.ubigeoRepository = ubigeoRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Ubigeo> getAll() {
        return this.ubigeoRepository.findAll();
    }

}
