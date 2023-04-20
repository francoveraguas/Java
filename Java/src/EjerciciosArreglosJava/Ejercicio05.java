/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosArreglosJava;

import java.util.Random;
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
        int[][] matriz = new int[3][3];
        int[][] matriztraspuesta = new int[3][3];
        Random random = new Random();
        int contador = 0;
        
        System.out.println("INGRESE LOS VALORES DE LA MATRIZ:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = leer.nextInt(); 
            }
        }
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
               matriztraspuesta[j][i] = matriz[i][j];
            }
        }    
        System.out.println("MATRIZ ORIGINAL: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("-[" + matriz[i][j] + "]"); 
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("MATRIZ TRASPUESTA: ");
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
                System.out.print("-[" + matriztraspuesta[j][i] + "]"); 
            }
            System.out.println("");
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
               if(matriz[i][j] ==  -matriztraspuesta[i][j]){
                   contador = contador + 1;
               }
            }
        } 
        System.out.println("");
        if(contador == 9){
            System.out.println("LA MATRIZ ES ANTISIMETRICA.");
        } else {
            System.out.println("LA MATRIZ NO ES ANTISIMETRICA.");
        }
        System.out.println("");
    }
    
}
