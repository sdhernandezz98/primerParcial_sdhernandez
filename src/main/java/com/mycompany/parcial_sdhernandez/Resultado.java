/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial_sdhernandez;
import java.util.Date;
/**
 *
 * @author sala6
 */


public class Resultado {
    private Date fecha;

    public boolean ejecutarConError(){
        return false;
    }
    public boolean ejecutoOk(){
        return false;
    }
    
    public void ejecutoConAdvertencia(){
        
    }
    
     public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Resultado(Date fecha) {
        this.fecha = fecha;
    }
    
}
