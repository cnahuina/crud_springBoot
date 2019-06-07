package com.csti.capacitacion.service.Imple;

import com.csti.capacitacion.entity.Bancos;
import com.csti.capacitacion.repository.BancoRepository;
import com.csti.capacitacion.service.BancosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BancosServiceImple implements BancosService {

    private BancoRepository bancoRepository;

    @Autowired
    public void setBancoRepository(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Bancos> getAll() {
        return this.bancoRepository.findAll();
    }

}
