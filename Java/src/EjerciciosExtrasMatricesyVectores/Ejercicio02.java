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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE TAMAÑO DE VECTOR: ");
        int tam = leer.nextInt();
        int[] vector1 = new int[tam];
        int[] vector2 = new int[tam];
        boolean iguales = true;
        
        System.out.println("");
        System.out.println("INGRESE VALORES DEL VECTOR 1:");
        for(int i = 0; i < tam; i++){
            vector1[i] = leer.nextInt();
        }
        System.out.println("");
        System.out.println("INGRESE VALORES DEL VECTOR 2:");
        for(int i = 0; i < tam; i++){
            vector2[i] = leer.nextInt();
        }
        for(int i = 0; i < tam; i++){
            if(vector1[i] != vector2[i]){
                iguales = false;
                break;
            }
        }
        System.out.println("");
        if(iguales == true){
            System.out.println("LOS VECTORES SON IGUALES");
        } else {
            System.out.println("LOS VECTORES SON DISTINTOS");
        }
    }
}
