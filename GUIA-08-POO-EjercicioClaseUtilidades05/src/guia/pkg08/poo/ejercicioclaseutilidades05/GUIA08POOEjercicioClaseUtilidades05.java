/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades05;

import guia.pkg08.poo.ejercicioclaseutilidades05.entidades.Persona;
import guia.pkg08.poo.ejercicioclaseutilidades05.entidades.servicios.PersonaServicios;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class GUIA08POOEjercicioClaseUtilidades05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PersonaServicios pS = new PersonaServicios();
        int edad;
        
        System.out.println("BIENVENIDO");
        System.out.println("");
        System.out.println("UTILIDADES JAVA - DATE");
        System.out.println("");
        System.out.println("VAMOS A CREAR UNA PERSONA:");
        Persona ps = pS.crearPersona();
        System.out.println("VAMOS A CALCULAR SU EDAD...");
        System.out.println("FINALIZADO");
        edad = pS.calcularEdad(ps);
        System.out.println("AHORA INGRESE UNA EDAD PARA COMPARAR CON LA PERSONA: ");
        int edadConsulta = leer.nextInt();
        boolean retorno = pS.menorQue(ps, edadConsulta);
        if(retorno == true){
            System.out.println("LA PERSONA ES MENOR A LA EDAD INGRESADA");
        } else {
            System.out.println("LA PERSONA ES MAYOR A LA EDAD INGRESADA");
        }
        System.out.println("");
        System.out.println("AHORA MOSTRAMOS LA INFORMACION DE LA PERSONA: ");
        pS.mostrarPersona(ps, edad);
    }
    
}
