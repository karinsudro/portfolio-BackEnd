package com.portfolio.karinsd.controller;

import com.portfolio.karinsd.entity.SkillTipo;
import com.portfolio.karinsd.service.SSkillTipo;
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
@RequestMapping("skillTipo") //localhost:8080/skillTipo
@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
public class CSkillTipo {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SSkillTipo skilltipoServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<SkillTipo> getSkillTipos(){
        return skilltipoServ.getSkillTipos();  
    }
    
    //para ver las habilid 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public SkillTipo findSkillTipo(@PathVariable int id){
        //si retorna vacío no pasa nada
        return skilltipoServ.findSkillTipo(id);  
    }
    
    //@RequestBody es para recibir un tipo de habilidad nueva. Viene en un JSON
    @PostMapping ("/new")
    public String saveSkillTipo(@RequestBody SkillTipo skilltip){
        skilltipoServ.saveSkillTipo(skilltip);
        return "El tipo de habilidad fue creado correctamente";
        //return ResponseEntity.ok().body(skilltip);
    
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteSkillTipo(@PathVariable int id){
        skilltipoServ.deleteSkillTipo(id);
        return "El tipo de habilidad fue borrada correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/edit/{id}")   
    public String editSkillTipo(@RequestBody SkillTipo skilltip){
        skilltipoServ.editSkillTipo(skilltip);
        return "El tipo de habilidad se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
}


//dde dice string iba response entity