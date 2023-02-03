package com.portfolio.karinsd.controller;

import com.portfolio.karinsd.entity.Categoria;
import com.portfolio.karinsd.service.SCategoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("categoria") //localhost:8080/categoria
@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
public class CCategoria {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SCategoria categServ;
    
    @GetMapping("/lista")
    //@ResponseBody 
    public List<Categoria> getCategorias(){
        return categServ.getCategorias();  
    }
    
    //para ver las categorías 
    @GetMapping("/find/{id}")
    //@ResponseBody 
    public Categoria findCategoria(@PathVariable int id){
        //si retorna vacío no pasa nada
        return categServ.findCategoria(id);  
    }
    
    //@RequestBody es para recibir una categoría nueva. Viene en un JSON
    @PostMapping ("/new")
    public String saveCategoria(@RequestBody Categoria categ){
        categServ.saveCategoria(categ);
        return "La categoría fue creada correctamente";
        //return ResponseEntity.ok().body(categ);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteCategoria(@PathVariable int id){
        categServ.deleteCategoria(id);
        return "La categoría fue borrada correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/edit/{id}")   
    public String editCategoria(@RequestBody Categoria categ){
        categServ.editCategoria(categ);
        return "La categoría se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
}
