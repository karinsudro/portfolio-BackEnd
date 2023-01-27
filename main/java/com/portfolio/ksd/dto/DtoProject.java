package com.portfolio.ksd.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class DtoProject implements Serializable{
    
    @NotNull
    private String imagen;
    @NotNull
    private String proyecto;    
    
    @Column(length=1000)
    private String descripcion;
    
    private String live_url;
    private String repo_url;

    
    public DtoProject() {
    }

    public DtoProject(String imagen, String proyecto, String descripcion, String live_url, String repo_url) {
        this.imagen = imagen;
        this.proyecto = proyecto;
        this.descripcion = descripcion;
        this.live_url = live_url;
        this.repo_url = repo_url;
    }
    
    
    
    
}
