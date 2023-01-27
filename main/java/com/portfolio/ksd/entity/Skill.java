package com.portfolio.ksd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;
//import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;   
    
    //private String habil_tipo;  //acá va 1:N con SkillTipo
    //@NotNull
    private String skill;
    private String icono;
    //@NotNull
    @Size(min=1, max=100)
    private int progreso;
    //@NotNull
    private String color;  //hacer relac para color?

    
    //relación skillTipo para tipo de habilid
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_skillTipo")
    private SkillTipo skillTipo;

    public Skill() {
    }

    public Skill(String skill, String icono, int progreso, String color, SkillTipo skillTipo) {
        this.skill = skill;
        this.icono = icono;
        this.progreso = progreso;
        this.color = color;
        this.skillTipo = skillTipo;
    }


    
}
