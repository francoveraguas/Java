/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejerciciodeaprendizaje04.figuras;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    
    private int base;
    private int altura;

    public Rectangulo() {
    }
    
    public void crearRectangulo(){
        System.out.println("INGRESE BASE: ");
        base = leer.nextInt();
        System.out.println("");
        System.out.println("INGRESE ALTURA: ");
        altura = leer.nextInt();
    }
    public int calcularSuperficie(){
        return (base*altura);
    }
    public int calcularPerimetro(){
        return (base+altura)*2;
    }
    public void dibujarRectangulo(){
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < base; j++){
            if(i == 0 || i == altura-1 || j == 0 || j == base-1){
                System.out.print(" * ");
            } else {
                System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
