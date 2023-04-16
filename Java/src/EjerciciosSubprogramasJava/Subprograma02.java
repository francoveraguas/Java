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
public class Subprograma02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        String resp = "NO";
        
        
        do {
            System.out.println("INGRESE NOMBRE Y EDAD: ");
            nombre = leer.next();
            edad = leer.nextInt();
            
            System.out.println("");
            System.out.println("ANALIZANDO DATOS. AGUARDE...");
            
            personas(nombre, edad);
            
            System.out.println("");
            System.out.println("DESEA SEGUIR INGRESANDO PERSONAS?");
            System.out.println("SI");
            System.out.println("NO");
            System.out.println("");
            resp = leer.next();
            
                
        } while(resp != "NO");
        
    }
    
    public static void personas(String nombre, int edad){
        if(edad >= 18){
                System.out.println("");
                System.out.println("NOMBRE: " + nombre);
                System.out.println("EDAD: " + edad);
                System.out.println("USTED ES MAYOR DE EDAD");
        } else {
            System.out.println("");
                System.out.println("NOMBRE: " + nombre);
                System.out.println("EDAD: " + edad);
                System.out.println("USTED ES MENOR DE EDAD");
        }
    }
}
