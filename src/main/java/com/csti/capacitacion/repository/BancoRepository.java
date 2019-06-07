package com.csti.capacitacion.repository;

import com.csti.capacitacion.entity.Bancos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BancoRepository extends JpaRepository<Bancos, Integer> {
}


