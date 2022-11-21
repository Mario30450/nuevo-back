package com.porfolioArgProg.SpringBoot.Model;

import javax.persistence.*;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPersona", nullable = false)
    private Long idPersona;

    public Long getId() {
        return idPersona;
    }

    public void setId(Long id) {
        this.idPersona = id;
    }

    public String nombre;
    public String apellido;
    public String sobreMi;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSobreMI() {
        return sobreMi;
    }

    public void setSobreMI(String SobreMi) {
        this.sobreMi = SobreMi;
    }
}
