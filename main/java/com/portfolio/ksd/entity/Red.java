package com.portfolio.ksd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Red {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;   
    
    //@NotNull
    private String red;
    //@NotNull
    private String link;
    //@NotNull
    private String icono;

    
    
    public Red() {
    }

    public Red(String red, String link, String icono) {
        this.red = red;
        this.link = link;
        this.icono = icono;
    }

    

    
    
    
}
