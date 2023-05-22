/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejerciciodeaprendizaje02.operaciones;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Circunferencia {
    private double rad;
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }
    public void crearCircunferencia(){
        System.out.println("INGRESE EL RADIO: ");
        rad = leer.nextDouble();
    }
    public double calcularArea(){
        double area = PI*(rad*rad);
        return area;
    }
    public double calcularPerimetro(){
        double perimetro = 2*PI*rad;
        return perimetro;
    }
}
