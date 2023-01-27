package com.portfolio.ksd.service;

import com.portfolio.ksd.entity.Persona;
import com.portfolio.ksd.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional   //persistencia en la db
public class SPersona {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    RPersona persoRepo;

    public List<Persona> getPersonas() {
        return persoRepo.findAll();
    }
    
    //si no encuentra la persona retorna null
    public Persona findPersona(Integer id) {
        return persoRepo.findById(id).orElse(null);   
    }
    
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void savePersona(Persona per) {
        persoRepo.save(per);  
    }
   
    public void deletePersona(Integer id) {
        persoRepo.deleteById(id);
    }

    public void editPersona(Persona pers) {
        persoRepo.save(pers);
    }
    
    //tomado de Celina
    public Persona loginPersona(String user, String password){
        List<Persona> persona=persoRepo.findByUserAndPassword(user, password);
        if(!persona.isEmpty()){
            return persona.get(0);
        }
        return null;
    }

}
