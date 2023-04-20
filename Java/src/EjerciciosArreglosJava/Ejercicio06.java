/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosArreglosJava;

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
       int[][] matriz = new int[3][3];
       int num;
       int sumaColumna0 = 0;
       int sumaFila0 = 0;
       int sumaDiagonal = 0;
       int comp = 0;
       boolean igual = true;
              
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
              do{
                  System.out.println("");
                  System.out.println("INGRESE VALOR ENTRE 1 Y 9: ");
                  num = leer.nextInt();
                  if(num > 0 && num < 10){
                      System.out.println("VALOR ACEPTADO");
                  } else {
                      System.out.println("VALOR RECHAZADO");
                  }
              } while(num < 1 || num > 9);
              matriz[i][j] = num;
           }
       }
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               System.out.print("[" + matriz[i][j] + "]");
           }
           System.out.println("");
       }
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
           if(i == 0){
               sumaColumna0 = sumaColumna0 + matriz[i][j];
               }
           }
       }
       for(int i = 0; i < 3; i++){
           comp = 0;
           for(int j = 0; j < 3; j++){
            comp = comp + matriz[i][j];
           }
           if(comp != sumaColumna0){
               igual = false;
           }
       }
       if(igual == true){
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
            if(j == 0){
                sumaFila0 = sumaFila0 + matriz[i][j];
                }
            }
        }
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
            if(i == j){
                sumaDiagonal = sumaDiagonal + matriz[i][j];
                }
            }
        }
       System.out.println("");
       if(sumaFila0 == sumaColumna0 && sumaDiagonal == sumaColumna0){
           System.out.println("LA MATRIZ ES MAGICA");
       }
       } else {
           System.out.println("");
           System.out.println("LA MATRIZ NO ES MAGICA");
       }
    }
}
