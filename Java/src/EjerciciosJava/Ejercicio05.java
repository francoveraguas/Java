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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        
        System.out.println("Su numero es: " + num);
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
        System.out.println("La raiz cuadrada es: " + raiz);
        
        
        
                
        
    }
    
}
