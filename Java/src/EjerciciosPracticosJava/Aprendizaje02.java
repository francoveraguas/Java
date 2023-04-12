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
public class Aprendizaje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase para comparar: ");
        String frase = leer.next();
        String comp = "eureka";
                
        boolean resultado = comp.equals(frase); 
        
        if(resultado == true){
            System.out.println("Frase Correcta");
        } else {
            System.out.println("Frase Incorrecta");
        }
    }
    
}
