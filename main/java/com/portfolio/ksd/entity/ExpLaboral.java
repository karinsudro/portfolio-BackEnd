package com.portfolio.ksd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExpLaboral {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;   
     
    //@NotNull
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
    private Categoria categoria;
    
    
    public ExpLaboral() {
    }

    public ExpLaboral(String cargo, String inicio, String fin, String lugar, String descripcion, Categoria categoria) {
        this.cargo = cargo;
        this.inicio = inicio;
        this.fin = fin;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    
}
