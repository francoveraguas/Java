/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaTeoricoJava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;

/**
 *
 * @author Franco
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        int longitud;
        
        System.out.println("INGRESE FRASE A CODIFICAR: ");
        frase = leer.nextLine();
        
        longitud = (int) length(frase);
        String[] vector = new String [longitud];
        
        for(int i = 0; i <= longitud-1; i++){
            vector[i] = frase.substring(i,i+1); 
            
        }
        for(int i = 0; i <= longitud-1; i++){
            if(vector[i].equals("a")){
                vector[i] = "@";    
            }
            if(vector[i].equals("e")){
                vector[i] = "#";    
            }
            if(vector[i].equals("i")){
                vector[i] = "$";    
            }
            if(vector[i].equals("o")){
                vector[i] = "%";    
            }
            if(vector[i].equals("u")){
                vector[i] = "*";    
            }
        }
        System.out.println("SU FRASE ES: ");
        
        for(int i = 0; i < longitud; i++){
            System.out.print(vector[i]); 
            
        }
        System.out.println("");
    }
    
}
