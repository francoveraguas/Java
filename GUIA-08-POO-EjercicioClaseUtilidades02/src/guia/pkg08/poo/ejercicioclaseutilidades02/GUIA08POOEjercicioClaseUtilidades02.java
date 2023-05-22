/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades02;

import guia.pkg08.poo.ejercicioclaseutilidades02.entidades.ParDeNumeros;
import guia.pkg08.poo.ejercicioclaseutilidades02.servicios.ParDeNumerosServicios;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class GUIA08POOEjercicioClaseUtilidades02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int rta;
        double mayor;
        ParDeNumerosServicios pdns = new ParDeNumerosServicios();
        
        System.out.println("BIENVENIDO");
        System.out.println("VAMOS A OPERAR CON DOS NUMEROS ALEATORIOS");
        System.out.println("");
        
        ParDeNumeros pdn = new ParDeNumeros();
        
        do{
        System.out.println(" -MENU- ");
        System.out.println(" -1- MOSTRAR NUMEROS ");
        System.out.println(" -2- DEVOLVER MAYOR ");
        System.out.println(" -3- NUMERO MAYOR ELEVADO AL [ NUMERO MENOR ] ");
        System.out.println(" -4- CALCULAR RAIZ DEL [ NUMERO MENOR ] ");
        System.out.println(" -5- RESETEAR NUMEROS ");
        System.out.println(" -6- SALIR ");
        System.out.println("");
        rta = leer.nextInt();
        System.out.println("");
        
        switch (rta) {
            case 1:
                pdns.mostrarNumeros(pdn);
                break;
            case 2:
                pdns.devolverMayor(pdn);
                System.out.println(pdns.devolverMayor(pdn));
                System.out.println("");
                break;
            case 3:
                pdns.calcularPotencia(pdn);
                break;
            case 4:
                pdns.calcularRaiz(pdn);
                break;
            case 5:
                pdns.resetearNumeros(pdn);
                break;    
            case 6:
                System.out.println("SALIENDO DEL SISTEMA...");
                break;
            }
        } while(rta < 6);
    }
}
    
