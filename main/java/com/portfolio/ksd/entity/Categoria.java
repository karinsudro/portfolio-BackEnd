package com.portfolio.ksd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import java.util.LinkedList;

@Entity
public class Categoria {
    
    private String categoria;
    //se cargan en db
    //private String teaching;
    //private String design;
    
    
    //cascade=CascadeType.ALL   si borro categ se borra lo q tenga asociado
    @OneToMany(mappedBy="categoria", fetch=FetchType.LAZY)
    private LinkedList<ExpLaboral> experiencias;

    
    public Categoria() {
    }

    public Categoria(String categoria, LinkedList<ExpLaboral> experiencias) {
        this.categoria = categoria;
        this.experiencias = experiencias;
    }

    
}
