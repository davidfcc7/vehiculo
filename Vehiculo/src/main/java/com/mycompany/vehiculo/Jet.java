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
public class Jet extends VehiculoMotorizado{
    private int cantidadMotores;
    public Jet(int cantidadMotores, String tipoGasolina, String marca, String modelo){
        super(tipoGasolina, marca, modelo);
        this.cantidadMotores = cantidadMotores;
    }

    /**
     * @return the cantidadMotores
     */
    public int getCantidadMotores() {
        return cantidadMotores;
    }

    /**
     * @param cantidadMotores the cantidadMotores to set
     */
    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }
    public void metodoJet(){
        System.out.println("Este es un Jet");
    }
}
