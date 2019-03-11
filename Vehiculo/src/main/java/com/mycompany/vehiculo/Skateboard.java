/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculo;

/**
 *
 * @author David
 */
public class Skateboard extends Vehiculo{
    private float longitudTabla;
    public Skateboard(float longitudTabla, String marca, String modelo){
        super(marca, modelo);
        this.longitudTabla = longitudTabla;
    }

    /**
     * @return the longitudTabla
     */
    public float getLongitudTabla() {
        return longitudTabla;
    }

    /**
     * @param longitudTabla the longitudTabla to set
     */
    public void setLongitudTabla(float longitudTabla) {
        this.longitudTabla = longitudTabla;
    }
    public void motodoSkateboard(){
        System.out.println("Esta es una Skateboard");
    }
}
