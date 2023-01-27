package com.portfolio.ksd.repository;

import com.portfolio.ksd.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Integer>{
    
    public List <Persona> findByUserAndPassword(String user, String password);
    
}
