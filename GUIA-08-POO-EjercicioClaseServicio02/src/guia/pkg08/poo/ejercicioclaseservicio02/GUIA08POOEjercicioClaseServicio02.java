/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseservicio02;

import guia.pkg08.poo.ejercicioclaseservicio02.entidades.Cafetera;
import guia.pkg08.poo.ejercicioclaseservicio02.servicios.CafeteraServicios;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class GUIA08POOEjercicioClaseServicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int rta;
           
        System.out.println("NESPRESSO - BIENVENIDO");
        System.out.println("");

        CafeteraServicios cs = new CafeteraServicios();
        Cafetera cf = new Cafetera();      
        do{
        System.out.println(" -MENU- ");
        System.out.println(" -1- PREPARAR CAFE ");
        System.out.println(" -2- LLENAR CAFETERA ");
        System.out.println(" -3- SERVIR TAZA ");
        System.out.println(" -4- VACIAR CAFETERA ");
        System.out.println(" -5- AGREGAR CAFE ");
        System.out.println(" -6- SALIR ");
        System.out.println("");
        rta = leer.nextInt();
        System.out.println("");
        switch (rta) {
            case 1:
                cf = cs.crearCafetera();
                break;
            case 2:
                cs.llenarCafetera(cf);
                break;
            case 3:
                cs.servirTaza(cf);
                break;
            case 4:
                cs.vaciarCafetera(cf);
                break;
            case 5:
                cs.agregarCafe(cf);
                break;
            case 6:
                System.out.println("SALIENDO DEL SISTEMA...");
                break;
            }
        } while(rta < 6);
    }
}
    
