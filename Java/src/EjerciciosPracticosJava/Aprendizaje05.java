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
public class Aprendizaje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int limite = 100;
        int suma = 0;
        do{
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            
            suma = suma + num;
                    
        } while (suma < limite);
        
        System.out.println("Se supero el limite de 100.");
        System.out.println("La suma de sus numeros es: " + suma);
    }
    
}
