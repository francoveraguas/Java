/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejerciciodeaprendizaje02;

import java.util.Scanner;
import poo.ejerciciodeaprendizaje02.operaciones.Circunferencia;

/**
 *
 * @author Franco
 */
public class POOEjercicioDeAprendizaje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Circunferencia cir1 = new Circunferencia(0);
        
        cir1.crearCircunferencia();
        
        System.out.println("RADIO UTILIZADO: "+cir1.getRad());
        System.out.println("");
        System.out.println("AHORA CALCULAMOS AREA Y PERIMETRO: ");
        cir1.calcularArea();
        cir1.calcularPerimetro();
        System.out.println("");
        System.out.println("EL PERIMETRO ES: "+cir1.calcularPerimetro());
        System.out.println("EL AREA ES: "+cir1.calcularArea());
    }
    
}
