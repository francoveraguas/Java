/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades01.servicios;

import guia.pkg08.poo.ejercicioclaseutilidades01.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class CadenaServicios {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        System.out.println("INGRESE FRASE: ");
        String frase = leer.next();
        System.out.println("");
        return new Cadena(frase);
    }
    
    
    public void mostrarVocales(Cadena cd){
        int contadorVocales = 0;
              
        System.out.println("VOCALES: ");
        for(int i = 0; i <= cd.getLongitud()-1; i++){
            String caracter = cd.getFrase().substring((i), (i+1));
            if(caracter.equalsIgnoreCase("a") || caracter.equalsIgnoreCase("e") || caracter.equalsIgnoreCase("i") || caracter.equalsIgnoreCase("o") || caracter.equalsIgnoreCase("u")){
                contadorVocales = contadorVocales+1;
                System.out.print("-[ "+caracter+" ]-");
            }
        } 
        System.out.println("");
        System.out.println("TOTAL VOCALES: "+contadorVocales);
        System.out.println("");
    }
    
    
    public void invertirCadena(Cadena cd){
        
        System.out.println("INVIRTIENDO FRASE: ");
        System.out.println("");
        for(int i = (cd.getLongitud()-1); i >= 0; i--){
            String caracter = cd.getFrase().substring((i), (i+1));
            System.out.print(caracter);
        }
        System.out.println("");
        System.out.println("");
    }  
    
    
    public void letraRepetida(Cadena cd){
        int contadorRepetida = 0;
        String rta;
        
        System.out.println("INGRESE LETRA A COMPARAR:");
        rta = leer.next();
        System.out.println("");
              
        System.out.println("LETRA: "+rta);
        for(int i = 0; i <= cd.getLongitud()-1; i++){
            String caracter = cd.getFrase().substring((i), (i+1));
            if(caracter.equalsIgnoreCase(rta)){
                contadorRepetida = contadorRepetida+1;
            }
        } 
        System.out.println("");
        System.out.println("VECES REPETIDA: "+contadorRepetida);
        System.out.println("");
    }
    
    
    public void compararLongitud(Cadena cd, String frase){
                
        if(frase.length() > cd.getLongitud()){
            System.out.println("LA NUEVA FRASE ES MAS LARGA.");
        } else {
            System.out.println("LA FRASE ORIGINAL ES MAS LARGA.");
        }
        System.out.println("");
    }
    
    
    public void unirCadenas(Cadena cd, String frase){
        String cadena = cd.getFrase().substring(0, 1);
        for(int i = 1; i <= cd.getLongitud()-1; i++){
            String caracter = cd.getFrase().substring((i), (i+1));
            cadena = cadena+caracter;
        } 
        cd.setFrase(cadena+frase);
        System.out.println("NUEVA FRASE: "+cd.getFrase());
        System.out.println("LONGITUD: "+cd.getLongitud());
        System.out.println("");
        cadena = null;
    }
    
    
    public void reemplazarLetra(Cadena cd){
        String rta;
        String cadena = cd.getFrase().substring(0, 1);
        
        for(int i = 1; i <= cd.getLongitud()-1; i++){
            String caracter = cd.getFrase().substring((i), (i+1));
            cadena = cadena+caracter;
        }
        
        System.out.println("INGRESE CARACTER PARA REEMPLAZAR LAS [ A ]: ");
        rta = leer.next();
        
            String cadena2 = "";   
        for(int i = 0; i <= cd.getLongitud()-1; i++){
            String caracter = cadena.substring((i), (i+1));
            if(caracter.equalsIgnoreCase("a")){
                cadena2 = cadena2+rta;
            } else {
                cadena2 = cadena2+caracter;
            }
        }
        
        cd.setFrase(cadena2);
        System.out.println("");
        System.out.println("NUEVA FRASE: "+cd.getFrase());
        System.out.println("");
    }
    
    
    public void contieneLetra(Cadena cd){
        String rta;
        int contadorCoincidencias = 0;
        
        System.out.println("INGRESE LETRA A BUSCAR: ");
        rta = leer.next();
        System.out.println("");
        
      for(int i = 0; i <= cd.getLongitud()-1; i++){
            String caracter = cd.getFrase().substring((i), (i+1));
            if(caracter.equalsIgnoreCase(rta)){
                contadorCoincidencias = contadorCoincidencias+1;
            }
        } 
        if(contadorCoincidencias > 0){
                System.out.println("AFIRMATIVO - HAY "+contadorCoincidencias+" COINCIDENCIAS");
            } else {
                System.out.println("NEGATIVO - NO HAY COINCIDENCIAS");
        }
        System.out.println("");
    }
}