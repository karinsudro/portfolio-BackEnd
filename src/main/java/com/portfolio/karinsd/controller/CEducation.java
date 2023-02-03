package com.portfolio.karinsd.controller;

import com.portfolio.karinsd.entity.Education;
import com.portfolio.karinsd.service.SEducation;
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
@RequestMapping("education") //localhost:8080/education
@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
public class CEducation {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SEducation educServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Education> getEducations(){
        return educServ.getEducations();  
    }
    
    //para ver los estudios 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Education findEducation(@PathVariable int id){
        //si retorna vacío no pasa nada
        return educServ.findEducation(id);  
    }
    
    //@RequestBody es para recibir un estudio nuevo. Viene en un JSON
    @PostMapping ("/new")
    public String saveEducation(@RequestBody Education educ){
        educServ.saveEducation(educ);
        return "El estudio fue creado correctamente";
        //return ResponseEntity.ok().body(educ);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteEducation(@PathVariable int id){
        educServ.deleteEducation(id);
        return "El estudio fue borrado correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/edit/{id}")   
    public String editEducation(@RequestBody Education educ){
        educServ.editEducation(educ);
        return "El estudio se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
}