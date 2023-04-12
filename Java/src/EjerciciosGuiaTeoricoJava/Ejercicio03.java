/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaTeoricoJava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Franco
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una frase para trabajar: ");
        String frase = leer.next();
        
        String fraseminus = toLowerCase(frase);
        String frasemayus = toUpperCase(frase);
        
        System.out.println("Su frase en minusculas es: " + fraseminus);
        System.out.println("Su frase en mayusculas es: " + frasemayus);
    }
    
}
