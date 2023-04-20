
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtrasMatricesyVectores;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE TAMAÑO DE VECTOR:");
        int tam = leer.nextInt();
        int[] vector = new int[tam];
        int suma = 0;
        
        System.out.println("INGRESE LOS VALORES DEL VECTOR:");
        for(int i = 0; i < tam; i++){
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        System.out.println("");
        System.out.println("LA SUMA DE TODOS LOS VALORES INGRESADOS ES: " + suma);
    }
    
}
