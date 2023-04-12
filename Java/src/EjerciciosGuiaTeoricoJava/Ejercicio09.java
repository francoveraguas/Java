/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaTeoricoJava;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int cont = 20;
        int suma = 0;
        
        do{
            System.out.println("Ingrese numero mayor a 0: ");
            int num = leer.nextInt();
            if(num > 0){
            suma = suma+num;
            }
            cont = cont-1;
            
            if (num == 0){
                System.out.println("Se capturo el numero 0");
                break;
            }
        } while(cont > 0);
        
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
    
}
