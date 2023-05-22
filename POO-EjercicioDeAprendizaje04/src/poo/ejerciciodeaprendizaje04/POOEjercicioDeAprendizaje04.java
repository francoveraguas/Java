/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejerciciodeaprendizaje04;

import java.util.Scanner;
import poo.ejerciciodeaprendizaje04.figuras.Rectangulo;

/**
 *
 * @author Franco
 */
public class POOEjercicioDeAprendizaje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO...");
        System.out.println("VAMOS A CONSTRUIR UN RECTANGULO...");
        System.out.println("");
        Rectangulo rec1 = new Rectangulo();
        System.out.println("PLANTILLA CARGADA...");
        rec1.crearRectangulo();
        System.out.println("");
        System.out.println("EXCELENTE: AHORA CALCULAMOS AREA Y PERIMETRO: ");
        System.out.println("");
        rec1.calcularSuperficie();
        rec1.calcularPerimetro();
        System.out.println("AREA: "+rec1.calcularSuperficie());
        System.out.println("PERIMETRO: "+rec1.calcularPerimetro());
        System.out.println("");
        System.out.println("Y AHORA LO DIBUJAMOS: ");
        rec1.dibujarRectangulo();
    }
    
}
