package com.portfolio.ksd.controller;

import com.portfolio.ksd.entity.Project;
import com.portfolio.ksd.service.SProject;
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
@RequestMapping("project") //localhost:8080/project
@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
public class CProject {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    private SProject projectServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Project> verProjects(){
        return projectServ.getProjects();  
    }
    
    //para ver las carreras 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Project verProject(@PathVariable int id){
        //si retorna vacío no pasa nada
        return projectServ.findProject(id);  
    }
    
    //@RequestBody es para recibir un proyecto nuevo. Viene en un JSON
    @PostMapping ("/new")
    public ResponseEntity crearProject(@RequestBody Project proj){
        projectServ.saveProject(proj);
        //return "El proyecto fue creado correctamente";   
        return ResponseEntity.ok().body(proj);
    }
  
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity eliminarProject(@PathVariable int id){
        projectServ.deleteProject(id);
        //return "El proyecto fue borrado correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/edit/{id}")   
    public ResponseEntity editarProject(@RequestBody Project proj){
        projectServ.editProject(proj);
        //return "El proyecto se actualizó correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
    
}
