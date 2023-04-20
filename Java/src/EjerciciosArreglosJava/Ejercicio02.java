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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INDIQUE TAMAÑO DE VECTOR: ");
        int tamaño = leer.nextInt();
        
        System.out.println("");
        System.out.println("AGUARDE, PROCESANDO VECTOR...");
        int[] vector = new int[tamaño];
        
        for(int i = 0; i < tamaño; i++){
            vector[i] = (int)(Math.random()*10);
        } 
        
        System.out.println("");
        System.out.println("VECTOR COMPLETO...");
        System.out.println("INGRESE UN NUMERO PARA BUSCAR DENTRO DEL VECTOR:");
        int num = leer.nextInt();
        
        int contador = 0;
        
        System.out.println("");
        for(int i = 0; i < tamaño; i++){
            if(vector[i] == num){
                System.out.println("COINCIDENCIA EN INDICE " + i);
                contador = contador + 1;
            }
        } 
        System.out.println("");
        if(contador > 1){
            System.out.println("SU NUMERO ESTA REPETIDO " + contador + " VECES.");
        } else if(contador == 0){
            System.out.println("NO HUBO COINCIDENCIAS.");
        }
    }
    
}
