package com.portfolio.karinsd.service;

import com.portfolio.karinsd.entity.Experiencia;
import com.portfolio.karinsd.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
@Transactional
public class SExperiencia {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public RExperiencia experRepo;

    //Endpoints
    public List<Experiencia> getExperiencias() {
        return experRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveExperiencia(Experiencia exper) {
        experRepo.save(exper);  
    }
    
    //si no encuentra el trabajo retorna null
    public Experiencia findExperiencia(Integer id) {
        return experRepo.findById(id).orElse(null);   
    }

    public void deleteExperiencia(Integer id) {
        experRepo.deleteById(id);
    }
    
    //mismo que create
    public void editExperiencia(Experiencia exper) {
        experRepo.save(exper);
    }
    
}
