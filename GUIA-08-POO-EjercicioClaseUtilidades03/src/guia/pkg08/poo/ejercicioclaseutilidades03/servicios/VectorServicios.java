/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades03.servicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class VectorServicios {
    private Scanner leer = new Scanner(System.in);
    
    public void inicializarA(double[] vectorA){   
//        Arrays.fill(vectorA, (((Math.random()*10)*100.0)/100.0));
        for(int i = 0; i < 50; i++){
            vectorA[i] = Math.round((Math.random()*10)*100.0)/100.0;
        }
        System.out.println("");
    }
    
    
    public void mostrarA(double[] vectorA){
        for(int i = 0; i < 50; i++){
            System.out.println("-[ "+vectorA[i]+" ]-");
        }
        System.out.println("");
    }
    
    
    public void ordenarA(double[] vectorA){
        Arrays.sort(vectorA);
        for(int i = 49; i >= 0; i--){
            System.out.println("-[ "+vectorA[i]+" ]-");
        }
        System.out.println("");
    }
    
    
    public void inicializarB(double[] vectorA, double[] vectorB){
        
        for(int i = 0; i < 10; i++){
            vectorB[i] = vectorA[i];
        }
        for(int i = 10; i < 19; i++){
            vectorB[i] = 0.5;
        }
        for(int i = 0; i < 20; i++){
        System.out.println("-[ "+vectorB[i]+" ]-");
        }
        System.out.println("");
    }
    
}
