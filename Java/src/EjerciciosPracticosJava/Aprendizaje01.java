/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticosJava;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Aprendizaje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero para determinar si es Par o ImPar");
        int num = leer.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Su numero es Par");
    } else {
            System.out.println("Su numero es ImPar");
        }
    }
    
}
