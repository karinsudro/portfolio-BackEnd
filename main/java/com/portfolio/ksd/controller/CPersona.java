package com.portfolio.ksd.controller;

import com.portfolio.ksd.entity.Persona;
import com.portfolio.ksd.service.SPersona;
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
@RequestMapping("persona") //localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
public class CPersona {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SPersona persoServ;
   
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Persona> verPersonas(){
        return persoServ.getPersonas();  
    }
    
    //para ver las personas 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Persona verPersona(@PathVariable int id){
        //si retorna vacío no pasa nada
        return persoServ.findPersona(id);  
    }
    
    //@RequestBody es para recibir una persona nueva. Viene en un JSON
    @PostMapping ("/new")
    public ResponseEntity crearPersona(@RequestBody Persona pers){
        persoServ.savePersona(pers);
        //return "La persona fue creada correctamente";
        return ResponseEntity.ok().body(pers);
    
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity eliminarPersona(@PathVariable int id){
        persoServ.deletePersona(id);
        //return "La persona fue borrada correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/edit/{id}")   
    public ResponseEntity editarPersona(@RequestBody Persona pers){
        persoServ.editPersona(pers);
        //return "La persona se actualizó correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
    
    
    @PostMapping("/autenticacion/login")
        //@ResponseBody
    public Persona loginPersona (@RequestBody Persona per){
        return persoServ.loginPersona( per.getUser(), per.getPassword());
    }
    
    
}
