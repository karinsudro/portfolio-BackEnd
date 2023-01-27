package com.portfolio.ksd.service;

import com.portfolio.ksd.entity.ExpLaboral;
import com.portfolio.ksd.repository.RExpLaboral;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExpLaboral {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    RExpLaboral explabRepo;

    public List<ExpLaboral> getExpLaborales() {
        return explabRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveExpLaboral(ExpLaboral explabo) {
        explabRepo.save(explabo);  
    }
    
    //si no encuentra el trabajo retorna null
    public ExpLaboral findExpLaboral(Integer id) {
        return explabRepo.findById(id).orElse(null);   
    }

    public void deleteExpLaboral(Integer id) {
        explabRepo.deleteById(id);
    }
    
    public void editExpLaboral(ExpLaboral explabo) {
        explabRepo.save(explabo);
    }
    
}
