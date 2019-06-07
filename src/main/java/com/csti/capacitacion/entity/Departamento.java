package com.csti.capacitacion.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="departamento")

public class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "departamento_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "departamento_id_seq", sequenceName = "departamento_id_seq", allocationSize = 1)
    private Integer id_departamento;

    @Column(name="nombre", nullable=false, length=50)
    private String nombre;

    public Departamento() {
    }

    public Integer getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(Integer id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
