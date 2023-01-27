package com.portfolio.ksd.dto;

import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class DtoRed implements Serializable{
    @NotNull
    private String red;
    @NotNull
    private String link;
    @NotNull
    private String icono;

    public DtoRed() {
    }

    public DtoRed(String red, String link, String icono) {
        this.red = red;
        this.link = link;
        this.icono = icono;
    }

    
    
}
