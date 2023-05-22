/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.claseservicio.ejercicio01;

import java.util.Scanner;
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
        
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        
        System.out.println("RED LINK - BIENVENIDO");
        System.out.println("");
        cbs.crearCuenta();
    }
    
}
