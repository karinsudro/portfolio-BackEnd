package com.portfolio.ksd.service;

import com.portfolio.ksd.entity.Education;
import com.portfolio.ksd.repository.REducation;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducation {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    REducation educRepo;

    public List<Education> getEducations() {
        return educRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveEducacion(Education educ) {
        educRepo.save(educ);  
    }
    
    //si no encuentra la carrera retorna null
    public Education findEducacion(Integer id) {
        return educRepo.findById(id).orElse(null);   
    }
    
    public void deleteEducacion(Integer id) {
        educRepo.deleteById(id);
    }
    

    public void editEducacion(Education educ) {
        educRepo.save(educ);
    }
    
    
}
