/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejerciciodeaprendizaje03.calculos;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Operaciones {
    Scanner leer = new Scanner(System.in);
    private double numero1;
    private double numero2;
    

    public Operaciones() {
    }

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.println("INGRESE PRIMER NUMERO: ");
        numero1 = leer.nextInt();
        System.out.println("");
        System.out.println("INGRESE SEGUNDO NUMERO: ");
        numero2 = leer.nextInt();
    }
    public double sumar(){
        return numero1+numero2;
    }
    public double restar(){
        return numero1-numero2;
    }
    public double multiplicar(){
        if(numero1 != 0 && numero2 != 0){
            return numero1*numero2;
        } else {
            return 0;
        }
    }
    public double dividir(){
       if(numero1 != 0 && numero2 != 0){
            return numero1/numero2;
        } else {
            return 0;
        } 
    }
}
