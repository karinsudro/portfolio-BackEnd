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
public class Project {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;   
    
    //@NotNull
    private String imagen;
    //@NotNull
    private String proyecto;    
    
    @Column(length=1000)
    private String descripcion;
    
    private String live_url;
    private String repo_url;

    
   
    public Project() {
    }

    public Project(String imagen, String proyecto, String descripcion, String live_url, String repo_url) {
        this.imagen = imagen;
        this.proyecto = proyecto;
        this.descripcion = descripcion;
        this.live_url = live_url;
        this.repo_url = repo_url;
    }

    

    
    
    
    
    
}
