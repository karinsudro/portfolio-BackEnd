package com.portfolio.karinsd.repository;

import com.portfolio.karinsd.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RPersona extends JpaRepository<Persona, Integer>{
    //login
    public List <Persona> findByEmailAndClave(String email, String clave);
    //public Persona findByEmailAndClave(String email, String clave);
}
