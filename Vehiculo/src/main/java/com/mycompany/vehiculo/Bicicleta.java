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
public class Bicicleta extends Vehiculo {
    private int cantidadEngranes;
    

    public Bicicleta(int cantidadEngranes, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadEngranes = cantidadEngranes;
    }

    /**
     * @return the cantidadEngranes
     */
    public int getCantidadEngranes() {
        return cantidadEngranes;
    }

    /**
     * @param cantidadEngranes the cantidadEngranes to set
     */
    public void setCantidadEngranes(int cantidadEngranes) {
        this.cantidadEngranes = cantidadEngranes;
    }

    public void metodoBicicleta() {
        System.out.println("Una bicicleta");
    }
    
    
    

    
}
