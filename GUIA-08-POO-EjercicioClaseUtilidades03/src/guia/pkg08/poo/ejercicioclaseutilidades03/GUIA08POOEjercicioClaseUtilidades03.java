/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades03;

import guia.pkg08.poo.ejercicioclaseutilidades03.servicios.VectorServicios;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class GUIA08POOEjercicioClaseUtilidades03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        
        System.out.println("BIENVENIDO");
        System.out.println("");
        System.out.println("INICIANDO PROGRAMA...");
        VectorServicios vs = new VectorServicios();
        System.out.println("");
        System.out.println("INICIALIZANDO VECTOR [ A ]");
        vs.inicializarA(vectorA);
        System.out.println("MOSTRAMOS EL VECTOR [ A ]");
        System.out.println("");
        vs.mostrarA(vectorA);
        System.out.println("ORDENAMOS EL VECTOR [ A ]");
        System.out.println("");
        vs.ordenarA(vectorA);
        System.out.println("INICIALIZANDO VECTOR [ B ]");
        System.out.println("");
        vs.inicializarB(vectorA, vectorB);
        
        
    }
    
}
