/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosArreglosJava;

import java.util.Random;



/**
 *
 * @author Franco
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        Random random = new Random();
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
               matriz[i][j] = random.nextInt(10); 
            }
        }
        System.out.println("MATRIZ ORIGINAL: ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("-[" + matriz[i][j] + "]"); 
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("MATRIZ TRASPUESTA: ");
        for(int j = 0; j < 4; j++){
            for(int i = 0; i < 4; i++){
                System.out.print("-[" + matriz[i][j] + "]"); 
            }
            System.out.println("");
        }
    }
    
}
