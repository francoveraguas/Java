/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades04;

import guia.pkg08.poo.ejercicioclaseutilidades04.servicios.FechaServicios;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class GUIA08POOEjercicioClaseUtilidades04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        FechaServicios fs = new FechaServicios();
        
        System.out.println("BIENVENIDO");
        System.out.println("");
        System.out.println("UTILIDADES JAVA - DATE");
        System.out.println("");
        System.out.println("FECHA DE NACIMIENTO:");
        Date fechaNacimiento = fs.fechaNacimiento();
        System.out.println("NACIMIENTO: "+fechaNacimiento.toString());
        System.out.println("");
        System.out.println("FECHA ACTUAL:");
        Date fechaActual = fs.fechaActual();
        System.out.println("ACTUAL: "+fechaActual.toString());
        System.out.println("");
        System.out.println("AHORA CALCULAMOS SU EDAD");
        System.out.println("PROCESANDO...");
        fs.calcularEdad(fechaNacimiento, fechaActual);
    }
    
}
