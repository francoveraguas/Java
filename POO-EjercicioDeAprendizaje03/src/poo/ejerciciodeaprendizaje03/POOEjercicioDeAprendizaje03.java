/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejerciciodeaprendizaje03;

import java.util.Scanner;
import poo.ejerciciodeaprendizaje03.calculos.Operaciones;

/**
 *
 * @author Franco
 */
public class POOEjercicioDeAprendizaje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
                
        Operaciones op = new Operaciones();
        
        System.out.println("VAMOS A INICIALIZAR EL PROGRAMA...");
        System.out.println("");
        op.crearOperacion();
        System.out.println("");
        System.out.println("VAMOS A REALIZAR LAS OPERACIONES... ");
        System.out.println("PROCESANDO...");
        System.out.println("");
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
                   
        System.out.println("TERMINADO. VISUALIZANDO RESULTADOS...");
        System.out.println("");
        System.out.println("SUMA: "+op.sumar());
        System.out.println("RESTA: "+op.restar());
        if(op.multiplicar() == 0){
            System.out.println("ERROR - Se intenta multiplicar por 0");
        } else {
            System.out.println("MULTIPLICACION: "+op.multiplicar()); 
        }
        if(op.dividir() == 0){
            System.out.println("ERROR - Se intenta dividir por 0");
        } else {
            System.out.println("DIVISION: "+op.dividir());
        }
        
        
    }
    
}
