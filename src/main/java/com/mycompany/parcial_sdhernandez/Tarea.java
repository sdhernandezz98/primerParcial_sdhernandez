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
public abstract class Tarea {
    private boolean habilitada;
    private boolean deshabilitarSiFalla;

    public void ejecutar(){}
    
    public abstract void doEjecutar();
    
    public Date ultimaEjecucion(){
    
        return new Date();
    }
    
    public void vecesQueSeEjecuto(Date a, Date b){}
    public void vecesQueSDioError(Date a, Date b){}
    
    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    public boolean isDeshabilitarSiFalla() {
        return deshabilitarSiFalla;
    }

    public void setDeshabilitarSiFalla(boolean deshabilitarSiFalla) {
        this.deshabilitarSiFalla = deshabilitarSiFalla;
    }
    
    
}
