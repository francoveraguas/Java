/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosSubprogramasJava;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Subprograma04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        boolean retorno;
        
        System.out.println("INGRESE NUMERO ENTERO:");
        num = leer.nextInt();
        
        retorno = numeroPrimo(num);
        
        if(retorno == true){
            System.out.println("EL NUMERO INGRESADO ES PRIMO.");
        } else {
            System.out.println("NO ES PRIMO.");
        }
    }
    public static boolean numeroPrimo(int num){
        int contador= 0;
        boolean retorno = false;
        
        for(int i = 1;i < num+1; i++){
            if(num % i == 0){
                contador = contador + 1;
            }
        }
        if(contador <= 2){
            retorno = true;
        } 
        return retorno;
    }
}
