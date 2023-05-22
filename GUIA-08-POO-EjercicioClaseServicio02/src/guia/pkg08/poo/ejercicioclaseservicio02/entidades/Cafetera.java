/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseservicio02.entidades;

/**
 *
 * @author Franco
 * 
 */
public class Cafetera {
    private int medidasCafe;
    private double capacidadMaxima = 1200;
    private double capacidadActual;

    public Cafetera() {
    }

    
    public Cafetera(int medidasCafe, double capacidadActual) {
        this.medidasCafe = medidasCafe;
        this.capacidadActual = capacidadActual;
    }
    
   
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

         
    public double getCapacidadActual() {
        return capacidadActual;
    }

    
    public int getMedidasCafe() {
        return medidasCafe;
    }

    
    public void setMedidasCafe(int medidasCafe) {
        this.medidasCafe = medidasCafe;
    }

    
    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    
}
