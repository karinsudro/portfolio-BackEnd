package com.portfolio.ksd.controller;

import com.portfolio.ksd.entity.Education;
import com.portfolio.ksd.service.SEducation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private SEducation educServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Education> verEducations(){
        return educServ.getEducations();  
    }
    
    //para ver las carreras 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Education verEducacion(@PathVariable int id){
        //si retorna vacío no pasa nada
        return educServ.findEducacion(id);  
    }
    
    //@RequestBody es para recibir una carrera nueva. Viene en un JSON
    @PostMapping ("/new")
    public ResponseEntity crearEducacion(@RequestBody Education educ){
        educServ.saveEducacion(educ);
        //return "La carrera fue creada correctamente";
        return ResponseEntity.ok().body(educ);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity eliminarEducacion(@PathVariable int id){
        educServ.deleteEducacion(id);
        //return "La carrera fue borrada correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/edit/{id}")   
    public ResponseEntity editarEducacion(@RequestBody Education educ){
        educServ.editEducacion(educ);
        //return "La carrera se actualizó correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
    
    
    
}
