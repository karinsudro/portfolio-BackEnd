package com.portfolio.ksd.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class DtoEducation implements Serializable{
    
    @NotNull
    private String carrera;
    @NotNull
    private String inicio;
    @NotNull
    private String fin;
    @NotNull
    private String institucion;
    @NotNull
    @Column(length=1000)
    private String descripcion;

    
    public DtoEducation() {
    }

    public DtoEducation(String carrera, String inicio, String fin, String institucion, String descripcion) {
        this.carrera = carrera;
        this.inicio = inicio;
        this.fin = fin;
        this.institucion = institucion;
        this.descripcion = descripcion;
    }
    
    
    
    
}
