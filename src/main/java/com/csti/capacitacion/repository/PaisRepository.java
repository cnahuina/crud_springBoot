package com.csti.capacitacion.repository;

import com.csti.capacitacion.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PaisRepository extends JpaRepository<Pais, Integer>{

}
