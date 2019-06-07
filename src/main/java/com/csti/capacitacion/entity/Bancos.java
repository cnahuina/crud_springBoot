package com.csti.capacitacion.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="banco")

public class Bancos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "banco_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "banco_id_seq", sequenceName = "banco_id_seq", allocationSize = 1)

    private Integer id_banco;

    @Column(name="razon_social", nullable=false, length=50)
    private String razon_social;

    @Column(name="ruc", nullable=false, length=12)
    private String ruc;

    public Bancos(){

    }

    public int getId_banco() {
        return id_banco;
    }

    public void setId_banco(int id_banco) {
        this.id_banco = id_banco;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}