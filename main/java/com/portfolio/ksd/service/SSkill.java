package com.portfolio.ksd.service;

import com.portfolio.ksd.entity.Skill;
import com.portfolio.ksd.repository.RSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SSkill {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    RSkill skillRepo;

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

    public void editSkill(Skill habil) {
        skillRepo.save(habil);
    }
    
    
    
}
