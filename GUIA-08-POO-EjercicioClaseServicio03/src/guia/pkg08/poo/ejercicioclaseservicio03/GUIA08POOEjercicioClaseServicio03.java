/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseservicio03;

import guia.pkg08.poo.ejercicioclaseservicio03.entidades.Persona;
import guia.pkg08.poo.ejercicioclaseservicio03.entidades.servicios.PersonaServicios;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class GUIA08POOEjercicioClaseServicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PersonaServicios ps = new PersonaServicios();
        Persona pa = new Persona();
        Persona[] vectorPersonas = new Persona[5];
        int[] vectorIMC = new int[5];
        
        int cont = 0;
        int pesoBajo = 0;
        int pesoNormal = 0;
        int pesoAlto = 0;
        
        
        System.out.println("BIENVENIDO...");
        System.out.println("");
           
        System.out.println("CARGANDO PROGRAMA...");
        System.out.println("");
        
        for(int i=0; i<5; i++){
            cont = cont+1;
        pa = ps.crearPersona();
        vectorPersonas[i] = pa;
            System.out.println("PERSONA Nº "+cont+" - CREADA CORRECTAMENTE.");
            System.out.println("");
            pa = null;
        }
        
        System.out.println("");
        cont = 0;
        for(int i=0; i<5; i++){
            Persona auxiliarMostrar;
            cont = cont+1;
            System.out.println("PERSONA Nº "+cont);
            System.out.print("");
            auxiliarMostrar = vectorPersonas[i];
            ps.mostrarPersona(auxiliarMostrar);
            System.out.println("");
        }
        
        System.out.println("INDICE DE MASA CORPORAL");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            Persona auxiliarIMC;
            auxiliarIMC = vectorPersonas[i];
            vectorIMC[i] = (ps.calcularIMC(auxiliarIMC));
        }
            System.out.println("");
            System.out.println("VEMOS EL SWITCH");
            
            for(int i=0; i<5; i++){
            switch(vectorIMC[i]){
                case -1:
                    pesoBajo = pesoBajo+1;
                    break;
                case 0:
                    pesoNormal = pesoNormal+1;
                    break;
                case 1:
                    pesoAlto = pesoAlto+1;
                    break;
            }
                
        }
                System.out.println("");
                System.out.println("PORCENTAJES PESO:");
                System.out.println("PESO BAJO: "+((pesoBajo*100)/5)+" %");
                System.out.println("PESO NORMAL: "+((pesoNormal*100)/5)+" %");
                System.out.println("PESO ALTO: "+((pesoAlto*100)/5)+" %");
                
                System.out.println("");
                ps.mayoriaEdad();
    }
    
}
