package com.portfolio.karinsd.service;

import com.portfolio.karinsd.entity.Skill;
import com.portfolio.karinsd.repository.RSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
@Transactional
public class SSkill {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public RSkill skillRepo;

    //Endpoints
    public List<Skill> getSkills() {
        return skillRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveSkill(Skill habil) {
        skillRepo.save(habil);  
    }

    //si no encuentra la habilidad retorna null
    public Skill findSkill(Integer id) {
        return skillRepo.findById(id).orElse(null);   
    }
    
    public void deleteSkill(Integer id) {
        skillRepo.deleteById(id);
    }

    //mismo que create
    public void editSkill(Skill habil) {
        skillRepo.save(habil);
    }
    
    //según la relac one to many, en el lado del many se pone  ???
    //public List<Skill> getSkillsBySkillTipo(Integer id){
     //   return skillRepo.findBySkillTipoId(int id);
    //}
    
}
