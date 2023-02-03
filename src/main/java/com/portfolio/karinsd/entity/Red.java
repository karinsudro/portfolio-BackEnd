package com.portfolio.karinsd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Red {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="id_red")
    private int id;   
    
    //@NotNull
    @Column(name="red")
    private String red;
    
    //@NotNull
    @Column(name="link")
    private String link;
    
    //@NotNull
    @Column(name="icono")
    private String icono;

    
    
    public Red() {
    }

    public Red(int id, String red, String link, String icono) {
        this.id = id;
        this.red = red;
        this.link = link;
        this.icono = icono;
    }

    
}
