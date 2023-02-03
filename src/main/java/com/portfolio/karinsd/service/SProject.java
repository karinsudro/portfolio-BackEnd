package com.portfolio.karinsd.service;

import com.portfolio.karinsd.entity.Project;
import com.portfolio.karinsd.repository.RProject;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
@Transactional
public class SProject {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public RProject projectRepo;

    //Endpoints
    public List <Project> getProjects() {
        return projectRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveProject(Project proj) {
        projectRepo.save(proj);  
    }

    //si no encuentra el proyecto retorna null
    public Project findProject(Integer id) {
        return projectRepo.findById(id).orElse(null);   
    }
    
    public void deleteProject(Integer id) {
        projectRepo.deleteById(id);
    }
    
    //mismo que create
    public void editProject(Project proj) {
        projectRepo.save(proj);
    }
    
}
