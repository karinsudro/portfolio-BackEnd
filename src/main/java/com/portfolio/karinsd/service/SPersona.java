package com.portfolio.karinsd.service;

import com.portfolio.karinsd.entity.Persona;
import com.portfolio.karinsd.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class SPersona {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public RPersona persoRepo;

    //Endpoints
    //public List<Persona> getPersonas() {
    //    return persoRepo.findAll();
    //}
    
    //si no encuentra la persona retorna null
    public Persona findPersona(Integer id) {
        return persoRepo.findById(id).orElse(null);   
    }
    
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    //public void savePersona(Persona per) {
    //    persoRepo.save(per);  
    //}
   
    //public void deletePersona(Integer id) {
    //    persoRepo.deleteById(id);
    //}

    //mismo que create
    public void editPersona(Persona pers) {
        persoRepo.save(pers);
    }
    
    //Login
    public Persona loginPersona(String user, String clave){
    
        List<Persona> persona=persoRepo.findByUserAndClave(user, clave);
        if(!persona.isEmpty()){
            return persona.get(0);  //si la lista no está vacía me retorna lo q hay en posic 0
        }
        return null;
    }
    
    
    
    
    /*public PersonaDTO login(String email, String password){
		Persona persona = rpersona.findByEmailAndPassword(email, password);
		PersonaDTO personaDTO = new PersonaDTO(persona.getId(),persona.getNombre(),persona.getApellido(),persona.getTitulo(),persona.getFrase(),persona.getAcercade(),persona.getImg_banner(),persona.getImg_pfp(),persona.getCvpdf(),persona.getTextofooter());
		return personaDTO;
	}*/
    
    
    
    
    
    
    
    
}
