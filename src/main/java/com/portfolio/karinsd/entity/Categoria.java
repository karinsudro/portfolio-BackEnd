package com.portfolio.karinsd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="id_categ")
    private int id;
    
    @Column(name="categoria")
    private String categoria;
    //se cargan en db
    //private String teaching;
    //private String design;
    
    
    //cascade=CascadeType.ALL   si borro categ se borra lo q tenga asociado
    @OneToMany(mappedBy="categoria", fetch=FetchType.LAZY)
    private List<Experiencia> expeList;

    
    public Categoria() {
    }

    public Categoria(int id, String categoria, List<Experiencia> expeList) {
        this.id = id;
        this.categoria = categoria;
        this.expeList = expeList;
    }

    
}
