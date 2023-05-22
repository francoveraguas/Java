/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicioextra02.simbolos;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Puntos {
    Scanner leer = new Scanner(System.in);
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos() {
    }
    
    public void crearPuntos(){
        System.out.println("INGRESE COORDENADAS X e Y DE PUNTO 1: ");
        x1 = leer.nextDouble();
        y1 = leer.nextDouble();
        System.out.println("");
        System.out.println("INGRESE COORDENADAS X e Y DE PUNTO 2: ");
        x2 = leer.nextDouble();
        y2 = leer.nextDouble();
        System.out.println("");
    }
    public double calcularDistancia(){
        return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
    }
    
}
