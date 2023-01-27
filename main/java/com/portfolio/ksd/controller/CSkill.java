package com.portfolio.ksd.controller;

import com.portfolio.ksd.entity.Skill;
import com.portfolio.ksd.service.SSkill;
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
@RequestMapping("skill") //localhost:8080/skill
@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
public class CSkill {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SSkill skillServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Skill> verSkills(){
        return skillServ.getSkills();  
    }
    
    //para ver las habilid 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Skill verSkill(@PathVariable int id){
        //si retorna vacío no pasa nada
        return skillServ.findSkill(id);  
    }
    
    //@RequestBody es para recibir una habilidad nueva. Viene en un JSON
    @PostMapping ("/new")
    public ResponseEntity crearSkill(@RequestBody Skill habil){
        skillServ.saveSkill(habil);
        //return "La habilidad fue creada correctamente";
        return ResponseEntity.ok().body(habil);
    
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity eliminarSkill(@PathVariable int id){
        skillServ.deleteSkill(id);
        //return "La habilidad fue borrada correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/edit/{id}")   
    public ResponseEntity editarSkill(@RequestBody Skill habil){
        skillServ.editSkill(habil);
        //return "La habilidad se actualizó correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
