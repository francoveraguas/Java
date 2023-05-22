/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.claseservicio.ejercicio01;

import java.util.Scanner;
import poo.claseservicio.ejercicio01.entidades.CuentaBancaria;
import poo.claseservicio.ejercicio01.servicios.CuentaBancariaServicios;

/**
 *
 * @author Franco
 */
public class POOClaseServicioEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int rta;
           
        System.out.println("RED LINK - BIENVENIDO");
        System.out.println("");

        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        CuentaBancaria cb = cbs.crearCuenta();
        
        System.out.println("USUARIO DNI: " + cb.getDniCliente());
        System.out.println("");
        
        do{
        System.out.println(" -MENU- ");
        System.out.println(" -1- DEPOSITAR ");
        System.out.println(" -2- EXTRAER ");
        System.out.println(" -3- EXTRACCION RAPIDA ");
        System.out.println(" -4- CONSULTA DE SALDO ");
        System.out.println(" -5- DATOS DE USUARIO ");
        System.out.println(" -6- SALIR ");
        rta = leer.nextInt();
        System.out.println("");
        switch (rta) {
            case 1:
                cbs.ingresarDinero(cb);
                break;
            case 2:
                cbs.retirarDinero(cb);
                break;
            case 3:
                cbs.retiroRapido(cb);
                break;
            case 4:
                cbs.consultaSaldo(cb);
                break;
            case 5:
                cbs.datosUsuario(cb);
                break;
            case 6:
                System.out.println("SALIENDO DEL SISTEMA...");
                break;
            }
        } while(rta < 6);
    }

}
