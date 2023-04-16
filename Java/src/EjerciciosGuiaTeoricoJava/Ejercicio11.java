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
        
        
        System.out.println("INGRESE FRASE A CODIFICAR: ");
        frase = leer.nextLine();
        
        String retorno = codificar(frase);
        
        System.out.println("SU FRASE ES: ");
        System.out.println(retorno);
        
        System.out.println("");
    }
   
    
public static String codificar(String frase){
int longitud;
String retorno;
    
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
        retorno = vector[0];
        
        for(int i = 0; i < longitud; i++){
            if(i > 0){
            retorno = retorno + vector[i];
            }
        }
    
return retorno;
}

}