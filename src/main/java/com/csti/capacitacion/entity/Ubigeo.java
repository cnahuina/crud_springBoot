package com.csti.capacitacion.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Ubigeo")

public class Ubigeo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "ubigeo_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ubigeo_id_seq", sequenceName = "ubigeo_id_seq", allocationSize = 1)

    private Integer id_ubigeo;


    //uni-directional many-to-one association to RubroBien
    @ManyToOne
    @JoinColumn(name="id_pais", nullable=false)
    private Pais pais;

    //uni-directional many-to-one association to UnidadMedida
    @ManyToOne
    @JoinColumn(name="id_departamento", nullable=false)
    private Departamento departamento;


    public Ubigeo() {

    }

    public Ubigeo(Pais pais, Departamento departamento) {
        this.pais = pais;
        this.departamento = departamento;
    }


    public Integer getId_ubigeo() {
        return id_ubigeo;
    }

    public void setId_ubigeo(Integer id_ubigeo) {
        this.id_ubigeo = id_ubigeo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
