/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaTeoricoJava;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int num2 = leer.nextInt();
        
        if(num1 > 25 && num2 > 25){
            System.out.println("Ambos numeros son mayores que 25");
        } else if(num1 > 25){
            System.out.println("El primer numero es mayor a 25");
        } else if(num2 > 25){
            System.out.println("El segundo numero es mayor a 25");
        } else{
            System.out.println("Ningun numero es mayor a 25");
        }        
    }
    
}
