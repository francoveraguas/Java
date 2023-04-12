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
public class Aprendizaje08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("De cuantos asteriscos quiere su cuadrado?");
        int num = leer.nextInt();
        
        for(int i = 1; i <= num; i++){
           for(int j = 1; j <= num; j++){
               if(i == 1 || i == num || j == 1 || j == num){
               System.out.print(" * ");
           } else {
                   System.out.print("   ");
                   }
            }
           System.out.println("");
        }
    }
    
}
