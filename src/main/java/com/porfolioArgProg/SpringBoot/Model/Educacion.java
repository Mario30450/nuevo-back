
package com.porfolioArgProg.SpringBoot.Model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter @Setter
@Entity

public class Educacion implements Serializable {
    
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long Id_Educacion;
    private String Fecha; 
    private String Institucion; 
    private String Carrera;
    
    
    
    public Educacion() {
    }
    
    public Educacion (long Id_Educacion, String Fecha, String Institucion, String Carrera){
    this.Id_Educacion = Id_Educacion;
    this.Fecha = Fecha;
    this.Institucion = Institucion;
    this.Carrera = Carrera;
   
    }

   public static boolean getEducacion(){

   }

   public void setEducacion(boolean educacion) {
   }
}
        
    
