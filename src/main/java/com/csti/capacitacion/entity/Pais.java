package com.csti.capacitacion.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="pais")

public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "id_pais", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "id_pais", sequenceName = "id_pais", allocationSize = 1)

    private Integer idPais;

    @Column(name="nombre", nullable=false, length=50)
    private String nombre;

    public Pais() {
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
