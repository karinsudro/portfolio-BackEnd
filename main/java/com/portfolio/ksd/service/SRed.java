package com.portfolio.ksd.service;

import com.portfolio.ksd.entity.Red;
import com.portfolio.ksd.repository.RRed;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SRed {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    RRed redRepo;

    public List<Red> getRedes() {
        return redRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveRed(Red redes) {
        redRepo.save(redes);  
    }

    //si no encuentra la red retorna null
    public Red findRed(Integer id) {
        return redRepo.findById(id).orElse(null);   
    }
    
    public void deleteRed(Integer id) {
        redRepo.deleteById(id);
    }
    

    public void editRed(Red redes) {
        redRepo.save(redes);
    }
    
    
    
}
