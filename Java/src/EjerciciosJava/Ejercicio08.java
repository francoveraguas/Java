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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nota:");
        int nota = leer.nextInt();
        
        while(nota < 0 || nota > 10){
            System.out.println("Ingrese nota: ");
            nota = leer.nextInt();
            
        }
    }
    
}
