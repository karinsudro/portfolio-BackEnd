package com.portfolio.ksd.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.LinkedList;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class DtoSkillTipo implements Serializable{
    
    private String dtoSkills_tipo;
    //se cargan en la db
    /*private String skillsfront;
    private String skillsback;
    private String skillsdesign;
    private String skillslang;
    private String skillssoft;*/
    
    //cascade=CascadeType.ALL   si borro tipo de habili se borra lo q tenga asociado
    @OneToMany(mappedBy="dtoSkillTipo", fetch=FetchType.LAZY)
    private LinkedList<DtoSkill> habilids;

    
    public DtoSkillTipo() {
    }

    public DtoSkillTipo(String dtoSkills_tipo, LinkedList<DtoSkill> habilids) {
        this.dtoSkills_tipo = dtoSkills_tipo;
        this.habilids = habilids;
    }
    
    
}
