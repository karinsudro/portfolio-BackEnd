package com.portfolio.ksd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Lob;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;   
    
    //@NotNull
    //@Size(min=1, max=45, message="No cumple con la longitud")
    private String hola;
    
    //@NotNull
    //@Size(min=1, max=45, message="No cumple con la longitud")
    private String nombre;
    
    //@NotNull
    //@Size(min=1, max=45, message="No cumple con la longitud")
    private String apellido;
    
    //@NotNull
    //@Size(min=1, max=45, message="No cumple con la longitud")
    private String cargo;
    
    //@NotNull
    private String titulo;
    
    //@NotNull
    private String foto;
    
    //@NotNull
    //@Lob
    @Column(length=1000)
    private String saludoA;   
    private String saludoB;
    private String saludoC;
    private String saludoD;
    private String saludoE;
    private String saludoF;
    private String saludoG;
            
    //@NotNull
    private String user;
    
    //@NotNull
    private String password;
    

    public Persona() {
    }

    public Persona(String hola, String nombre, String apellido, String cargo, String titulo, String foto, String saludoA, String saludoB, String saludoC, String saludoD, String saludoE, String saludoF, String saludoG, String user, String password) {
        this.hola = hola;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.titulo = titulo;
        this.foto = foto;
        this.saludoA = saludoA;
        this.saludoB = saludoB;
        this.saludoC = saludoC;
        this.saludoD = saludoD;
        this.saludoE = saludoE;
        this.saludoF = saludoF;
        this.saludoG = saludoG;
        this.user = user;
        this.password = password;
    }

    
    
    

    
    

    
}
