package com.portfolio.ksd.dto;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class DtoExpLaboral implements Serializable{
    
    private String cargo;
    //@NotNull
    private String inicio;
    private String fin;
    //@NotNull
    private String lugar;
    
    //@NotNull
    @Column(length=1000)
    private String descripcion;

    //relación categoría para experiencia Teaching y Design
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_categ")
    private DtoCategoria categoria;

    public DtoExpLaboral() {
    }

    public DtoExpLaboral(String cargo, String inicio, String fin, String lugar, String descripcion, DtoCategoria categoria) {
        this.cargo = cargo;
        this.inicio = inicio;
        this.fin = fin;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }
    
    
    
}
