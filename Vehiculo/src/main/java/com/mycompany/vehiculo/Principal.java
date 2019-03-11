/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculo;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author David
 */
public class Principal {
    List <Vehiculo> lista = new ArrayList<>();
    
    Vehiculo skate = new Skateboard(10,"Kpc","2019");
    Vehiculo bicicleta = new Bicicleta(5,"Trek","2019");
    Vehiculo carro = new Carro(12,"Acpm","Jeep","2015");
    Vehiculo jet = new Jet(2,"Dornier","328","2015");
    
    
    public Principal(){
        lista.add(jet);
        lista.add(carro);
        lista.add(bicicleta);
        lista.add(skate);
        
        for(Vehiculo i:lista){
            if(i instanceof Carro){
                Carro c = (Carro)i;
                c.metodoCarro();
                c.informacion();
                System.out.println("Marca:"+c.getMarca());
                System.out.println("Marca:"+c.getModelo());
                System.out.println("Marca:"+c.getTipoGasolina());
                System.out.println("Marca:"+c.getCapacidadMotor());
            }
            else if(i instanceof Jet){
                Jet j = (Jet)i;
                j.metodoJet();
                j.informacion();
                System.out.println("Marca: "+j.getMarca());
                System.out.println("Modelo: "+j.getModelo());
                System.out.println("Gasolina: "+j.getTipoGasolina());
                System.out.println("Cantidad motores: "+j.getCantidadMotores());
            }
            else if(i instanceof Bicicleta){
                Bicicleta b=(Bicicleta)i;
                b.metodoBicicleta();
                b.informacion();
                System.out.println("Marca: "+b.getMarca());
                System.out.println("Modelo: "+b.getModelo());
                System.out.println("Cantidad engranajes: "+b.getCantidadEngranes());
            }
            else if(i instanceof Skateboard){
                Skateboard s=(Skateboard)i;
                s.motodoSkateboard();
                s.informacion();
                System.out.println("Marca: "+s.getMarca());
                System.out.println("Modelo: "+s.getModelo());
                System.out.println("Largo de tabla: "+s.getLongitudTabla());
            }
        }
    }
}
