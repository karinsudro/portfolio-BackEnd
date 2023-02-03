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
public class SkillTipo {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="id_skill_tipo")
    private int id;
    
    @Column(name="skillTipo")
    private String skill_tipo;
    //se cargan en la db
    /*private String skillsfront;
    private String skillsback;
    private String skillsdesign;
    private String skillslang;
    private String skillssoft;*/
    
    //cascade=CascadeType.ALL   si borro tipo de habili se borra lo q tenga asociado
    @OneToMany(mappedBy="skillTipo", fetch=FetchType.LAZY)
    private List<Skill> skillList ;

    
    public SkillTipo() {
    }

    public SkillTipo(String skill_tipo) {
        this.skill_tipo = skill_tipo;
        
        //skillList= new ArrayList();
    }
    
}
