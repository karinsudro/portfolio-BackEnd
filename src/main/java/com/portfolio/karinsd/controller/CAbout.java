package com.portfolio.karinsd.controller;

import com.portfolio.karinsd.entity.About;
import com.portfolio.karinsd.service.SAbout;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("about") //localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
public class CAbout {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SAbout aboutServ;
   
    //Endpoints
    @GetMapping("/lista")
    @ResponseBody 
    public List<About> getAbouts(){
        return aboutServ.getAbouts();  
    }
    
    //para ver about me 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public About findAbout(@PathVariable int id){
        //si retorna vacío no pasa nada
        return aboutServ.findAbout(id);  
    }
    
    //@RequestBody es para recibir un about nuevo. Viene en un JSON
    @PostMapping ("/new")
    public String saveAbout(@RequestBody About aboutme){
        aboutServ.saveAbout(aboutme);
        return "Los datos fueron creados correctamente";
        //return ResponseEntity.ok().body(pers);
    
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteAbout(@PathVariable int id){
        aboutServ.deleteAbout(id);
        return "Los datos fueron borrados correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/edit/{id}")   
    public String editAbout(@RequestBody About aboutme){
        aboutServ.editAbout(aboutme);
        return "Los datos se actualizaron correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    
}
