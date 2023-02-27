package com.portfolio.karinsd.service;

import com.portfolio.karinsd.entity.Education;
import com.portfolio.karinsd.repository.REducation;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SEducation {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public REducation educRepo;

    //Endpoints
    public List<Education> getEducations() {
        return educRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveEducation(Education educ) {
        educRepo.save(educ);  
    }
    
    //si no encuentra la carrera retorna null
    public Education findEducation(Integer id) {
        return educRepo.findById(id).orElse(null);   
    }
    
    public void deleteEducation(Integer id) {
        educRepo.deleteById(id);
    }
    
    //mismo que create
    public void updateEducation(Education educ) {
        educRepo.save(educ);
    }
    
}
