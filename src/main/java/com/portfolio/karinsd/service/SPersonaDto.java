package com.portfolio.karinsd.service;

import lombok.Getter;
import lombok.Setter;



@Getter @Setter
public class SPersonaDto {  
    
    int id;
    
    private String hola;
    
    private String nombre;
    
    private String apellido;
    
    private String cargo;

    
    public SPersonaDto() {
    }

    public SPersonaDto(int id, String hola, String nombre, String apellido, String cargo) {
        this.id = id;
        this.hola = hola;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }
    
    
    
    
}
