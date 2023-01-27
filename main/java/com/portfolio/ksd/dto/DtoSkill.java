package com.portfolio.ksd.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoSkill implements Serializable{
    
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
    private DtoSkillTipo dtoSkillTipo;

    public DtoSkill() {
    }

    public DtoSkill(String skill, String icono, int progreso, String color, DtoSkillTipo dtoSkillTipo) {
        this.skill = skill;
        this.icono = icono;
        this.progreso = progreso;
        this.color = color;
        this.dtoSkillTipo = dtoSkillTipo;
    }
    
    
}
