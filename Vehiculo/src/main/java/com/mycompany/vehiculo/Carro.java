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
public class Carro extends VehiculoMotorizado {
    private float capacidadMotor;
    public Carro(float capacidadMotor, String tipoGasolina, String marca, String modelo){
        super(tipoGasolina, marca, modelo);
        this.capacidadMotor = capacidadMotor;
    }

    /**
     * @return the capacidadMotor
     */
    public float getCapacidadMotor() {
        return capacidadMotor;
    }

    /**
     * @param capacidadMotor the capacidadMotor to set
     */
    public void setCapacidadMotor(float capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }

    public void metodoCarro() {
        System.out.println("Este es un carro");
    }
    
}
