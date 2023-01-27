package com.portfolio.ksd.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.LinkedList;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class DtoCategoria implements Serializable{
    
    private String categoria;
    //se cargan en db
    //private String teaching;
    //private String design;
    
    
    //cascade=CascadeType.ALL   si borro categ se borra lo q tenga asociado
    @OneToMany(mappedBy="categoria", fetch=FetchType.LAZY)
    private LinkedList<DtoExpLaboral> experiencias;

    
    public DtoCategoria() {
    }

    public DtoCategoria(String categoria, LinkedList<DtoExpLaboral> experiencias) {
        this.categoria = categoria;
        this.experiencias = experiencias;
    }

    
    
    
}
