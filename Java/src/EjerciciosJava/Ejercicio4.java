/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de grados Centigrados: ");
        int grados = leer.nextInt();
        
        double farenheit = 32 + (9 * grados / 5);
        
        System.out.println("El equivalente en Farenheit es: " + farenheit);
    }
    
}
