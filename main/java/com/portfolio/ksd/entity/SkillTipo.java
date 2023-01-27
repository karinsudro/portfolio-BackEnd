package com.portfolio.ksd.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import java.util.LinkedList;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SkillTipo {
    
    private String skills_tipo;
    //se cargan en la db
    /*private String skillsfront;
    private String skillsback;
    private String skillsdesign;
    private String skillslang;
    private String skillssoft;*/
    
    //cascade=CascadeType.ALL   si borro tipo de habili se borra lo q tenga asociado
    @OneToMany(mappedBy="skillTipo", fetch=FetchType.LAZY)
    private LinkedList<Skill> habilids;

    
    public SkillTipo() {
    }

    public SkillTipo(String skills_tipo, LinkedList<Skill> habilids) {
        this.skills_tipo = skills_tipo;
        this.habilids = habilids;
    }

    
    
    
}
