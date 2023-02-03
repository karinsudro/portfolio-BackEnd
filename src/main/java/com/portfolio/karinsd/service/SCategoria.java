package com.portfolio.karinsd.service;

import com.portfolio.karinsd.entity.Categoria;
import com.portfolio.karinsd.repository.RCategoria;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SCategoria {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public RCategoria categRepo;

    //Endpoints CRUD
    public List<Categoria> getCategorias() {
        return categRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveCategoria(Categoria categ) {
        categRepo.save(categ);  
    }
    
    //si no encuentra la categoría retorna null
    public Categoria findCategoria(Integer id) {
        return categRepo.findById(id).orElse(null);   
    }

    public void deleteCategoria(Integer id) {
        categRepo.deleteById(id);
    }
    //mismo que para create
    public void editCategoria(Categoria categ) {
        categRepo.save(categ);
    }
    
}
