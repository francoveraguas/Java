/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticosJava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Franco
 */
public class Aprendizaje07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        boolean frasedesalida;
        boolean primeroigual;
        boolean ultimoigual;
        int contadorcorrectas = 0;
        int contadorincorrectas = 0;
        String frase;
        String primercaracter;
        String ultimocaracter;
        
        do{ 
            System.out.println("Ingrese codigo: ");
            frase = leer.next();
            frasedesalida = "&&&&&".equals(frase);
            int longitud = (int) length(frase);
            frase = toUpperCase(frase);
            
            primercaracter = frase.substring(0,1);
            primeroigual = "X".equals(primercaracter);
            
            ultimocaracter = frase.substring(4,5);
            ultimoigual = "O".equals(ultimocaracter);
            
            if(longitud == 5 && primeroigual == true && ultimoigual == true){
           contadorcorrectas = contadorcorrectas + 1;
            } else {
                if(frasedesalida == false){
                contadorincorrectas = contadorincorrectas + 1;
                }
            }
            
        } while(frasedesalida != true);
        
        System.out.println("");
        System.out.println("LOS CODIGOS CORRECTOS SON: " + contadorcorrectas);
        System.out.println("");
        System.out.println("LOS CODIGOS INCORRECTOS SON: " + contadorincorrectas);
    } 
    
}
