package com.portfolio.karinsd.controller;

import com.portfolio.karinsd.entity.Experiencia;
import com.portfolio.karinsd.service.SExperiencia;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("experiencia") //localhost:8080/exp_laboral
@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
public class CExperiencia {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SExperiencia experServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Experiencia> getExperiencias(){
        return experServ.getExperiencias();  
    }
    
    //para ver las experiencias 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Experiencia findExperiencia(@PathVariable int id){
        //si retorna vacío no pasa nada
        return experServ.findExperiencia(id);  
    }
    
    //@RequestBody es para recibir un cargo. Viene en un JSON
    @PostMapping ("/new")
    public String saveExperiencia(@RequestBody Experiencia exper){
        experServ.saveExperiencia(exper);
        return "El cargo fue creado correctamente";
        //return ResponseEntity.ok().body(exper);
    } 

    @DeleteMapping("/delete/{id}")
    public String deleteExperiencia(@PathVariable int id){
        experServ.deleteExperiencia(id);
        return "El cargo fue borrado correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/editar/{id}")   
    public String editExperiencia(@RequestBody Experiencia exper){
        experServ.editExperiencia(exper);
        return "El cargo se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
}
