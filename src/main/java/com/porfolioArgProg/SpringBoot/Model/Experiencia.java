

package com.porfolioArgProg.SpringBoot.Model;



import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity

public class Experiencia implements Serializable {
    
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
     private long Id_Experiencia;
    private String Fechas; 
    private String Descripcion ; 
    private String Puesto;
    
    
    
    public Experiencia () {
    }
    
    public Experiencia (long Id_Experiencia, String Fechas, String Descripcion, String Puesto){
    this.Id_Experiencia = Id_Experiencia;
    this.Fechas = Fechas;
    this.Descripcion = Descripcion;
    this.Puesto = Puesto;
   
    }
    
}
