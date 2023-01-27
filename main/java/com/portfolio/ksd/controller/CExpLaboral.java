package com.portfolio.ksd.controller;

import com.portfolio.ksd.entity.ExpLaboral;
import com.portfolio.ksd.service.SExpLaboral;
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
@RequestMapping("exp_laboral") //localhost:8080/exp_laboral
@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
public class CExpLaboral {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SExpLaboral explabServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<ExpLaboral> verExpLaborales(){
        return explabServ.getExpLaborales();  
    }
    
    //para ver las experiencias 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public ExpLaboral verExpLaboral(@PathVariable int id){
        //si retorna vacío no pasa nada
        return explabServ.findExpLaboral(id);  
    }
    
    //@RequestBody es para recibir un cargo. Viene en un JSON
    @PostMapping ("/new")
    public ResponseEntity crearExpLaboral(@RequestBody ExpLaboral explabo){
        explabServ.saveExpLaboral(explabo);
        //return "El cargo fue creado correctamente";
        return ResponseEntity.ok().body(explabo);
    } 

    @DeleteMapping("/delete/{id}")
    public ResponseEntity eliminarExpLaboral(@PathVariable int id){
        explabServ.deleteExpLaboral(id);
        //return "El cargo fue borrado correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
    //para editar
    @PutMapping("/editar/{id}")   
    public ResponseEntity editarExpLaboral(@RequestBody ExpLaboral explabo){
        explabServ.editExpLaboral(explabo);
        //return "El cargo se actualizó correctamente";
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
