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
public class Vehiculo {
    private String marca;
    private String modelo;
    
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        
        
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     *informacion del vehiculo
     */
    public void informacion(){
        System.out.println("Informacion del Vehiculo");
   
    }

    /**
     *creacion del metodo vehiculo
     */
    public void metodoVehiculo(){
        System.out.println("Este es un vehiculo");
    }
}
