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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 numeros entre 1 y 20:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        
        System.out.print(num1);
        for(int i = 1; i < num1+1; i++){
            System.out.print("*");
            }
        System.out.println("");
        System.out.print(num2);
        for(int i = 1; i < num2+1; i++){
            System.out.print("*");
            }
        System.out.println("");
        System.out.print(num3);
        for(int i = 1; i < num3+1; i++){
            System.out.print("*");
            }
        System.out.println("");
        System.out.print(num4);
        for(int i = 1; i < num4+1; i++){
            System.out.print("*");
            }
        System.out.println("");
    }
    
    
}
