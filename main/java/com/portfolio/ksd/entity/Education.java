package com.portfolio.ksd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;   
    
    //@NotNull
    private String carrera;
    //@NotNull
    private String inicio;
    //@NotNull
    private String fin;
    //@NotNull
    private String institucion;
    //@NotNull
    @Column(length=1000)
    private String descripcion;

    
    public Education() {
    }

    public Education(String carrera, String inicio, String fin, String institucion, String descripcion) {
        this.carrera = carrera;
        this.inicio = inicio;
        this.fin = fin;
        this.institucion = institucion;
        this.descripcion = descripcion;
    }

    
    
    
    
    
    
}
