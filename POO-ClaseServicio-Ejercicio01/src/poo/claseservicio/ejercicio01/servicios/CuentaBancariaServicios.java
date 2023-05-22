/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.claseservicio.ejercicio01.servicios;

import java.util.Scanner;
import poo.claseservicio.ejercicio01.entidades.CuentaBancaria;

/**
 *
 * @author Franco
 */
public class CuentaBancariaServicios {
    Scanner leer = new Scanner(System.in);
    CuentaBancaria cb = new CuentaBancaria();
    
    public void crearCuenta(){
        System.out.println("INGRESE DNI: ");
        cb.setDniCliente(leer.nextLong());
        System.out.println("");
        System.out.println("INGRESE NUMERO DE CUENTA: ");
        cb.setNumeroCuenta(leer.nextInt());
        System.out.println("");
        System.out.println("INGRESE SALDO: ");
        cb.setSaldoActual(leer.nextDouble());
    }
    public void ingresarDinero(){
        double saldo = cb.getSaldoActual();
        System.out.println("SALDO DISPONIBLE: " + saldo);
        System.out.println("");
        System.out.println("CUANTO DESEA INGRESAR?");
        double ingreso = leer.nextDouble();
        cb.setSaldoActual(saldo+ingreso);
    }
    public void retirarDinero(){
        double saldo = cb.getSaldoActual();
        System.out.println("SALDO DISPONIBLE: " + saldo);
        System.out.println("");
        System.out.println("CUANTO DESEA RETIRAR?");
        double retiro = leer.nextDouble();
        if(retiro > saldo){
            System.out.println("NO DISPONE DE FONDOS PARA ESTA EXTRACCION: ");
            System.out.println("DESEA EXTRAER EL TOTAL DE SU CUENTA?");
            System.out.println("S - SI");
            System.out.println("N - NO");
            String rta = leer.next();
            if(rta.equalsIgnoreCase("S")){
                System.out.println("AGUARDE, RETIRANDO DINERO...");
                cb.setSaldoActual(0);
            } else {
                System.out.println("AGUARDE, RETIRANDO DINERO...");
                cb.setSaldoActual(saldo-retiro);
            }
        }
    }
    
    
}
