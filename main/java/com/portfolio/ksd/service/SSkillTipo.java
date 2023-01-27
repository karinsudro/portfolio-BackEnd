package com.portfolio.ksd.service;

import com.portfolio.ksd.entity.SkillTipo;
import com.portfolio.ksd.repository.RSkillTipo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SSkillTipo {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    RSkillTipo skilltipoRepo;

    public List<SkillTipo> getSkillTipos() {
        return skilltipoRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveSkillTipo(SkillTipo skilltip) {
        skilltipoRepo.save(skilltip);  
    }

    //si no encuentra el tipo de habilidad retorna null
    public SkillTipo findSkillTipo(Integer id) {
        return skilltipoRepo.findById(id).orElse(null);   
    }
    
    public void deleteSkillTipo(Integer id) {
        skilltipoRepo.deleteById(id);
    }

    public void editSkillTipo(SkillTipo skilltip) {
        skilltipoRepo.save(skilltip);
    }
    
    
}
