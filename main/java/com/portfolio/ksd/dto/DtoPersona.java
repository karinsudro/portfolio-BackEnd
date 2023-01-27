package com.portfolio.ksd.dto;

//import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class DtoPersona implements Serializable{
    //en el DTO pongo lo mismo que en la entity pero sin el ID
    
    @NotNull
    private String hola;
    
    @NotNull
    private String nombre;
    
    @NotNull
    private String apellido;
    
    @NotNull
    private String cargo;
    
    @NotNull
    private String user;
    
    @NotNull
    private String password;
    
    @NotNull
    private String titulo;
    
    @NotNull
    private String foto;
    
    @NotNull
    private String saludoA;   
    private String saludoB;
    private String saludoC;
    private String saludoD;
    private String saludoE;
    private String saludoF;
    private String saludoG;

    public DtoPersona() {
    }

    public DtoPersona(String hola, String nombre, String apellido, String cargo, String user, String password, String titulo, String foto, String saludoA, String saludoB, String saludoC, String saludoD, String saludoE, String saludoF, String saludoG) {
        this.hola = hola;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.user = user;
        this.password = password;
        this.titulo = titulo;
        this.foto = foto;
        this.saludoA = saludoA;
        this.saludoB = saludoB;
        this.saludoC = saludoC;
        this.saludoD = saludoD;
        this.saludoE = saludoE;
        this.saludoF = saludoF;
        this.saludoG = saludoG;
    }

    
    
    
    
    
}
