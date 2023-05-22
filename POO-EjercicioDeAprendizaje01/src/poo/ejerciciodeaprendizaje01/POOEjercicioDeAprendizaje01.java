/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejerciciodeaprendizaje01;

import java.util.Scanner;
import poo.ejerciciodeaprendizaje01.entidades.Libro;

/**
 *
 * @author Franco
 */
public class POOEjercicioDeAprendizaje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Libro lb1 = new Libro();
        
        lb1.crearLibro();
        
        System.out.println("");
        
        lb1.mostrarLibro();
        
    }
    
}
