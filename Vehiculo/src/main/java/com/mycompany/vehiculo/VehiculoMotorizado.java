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
public abstract class VehiculoMotorizado extends Vehiculo{
    private String tipoGasolina;

    public VehiculoMotorizado(String tipoGasolina, String marca, String modelo) {
        super(marca, modelo);
        this.tipoGasolina = tipoGasolina;
        
    }
    
    /**
     * @return the tipoGasolina
     */
    public String getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public void VehiculoMotorizado() {
        System.out.println("Este es un codigo Motorizado");
    }
    
    
    
}
