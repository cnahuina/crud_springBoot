package com.csti.capacitacion.repository;

import com.csti.capacitacion.entity.Ubigeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbigeoRepository extends JpaRepository<Ubigeo,Integer> {

}
