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
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public CuentaBancaria crearCuenta(){
        System.out.println("INGRESE NUMERO DE CUENTA: ");
        int numeroCuenta = leer.nextInt();
        System.out.println("");
        System.out.println("INGRESE DNI: ");
        long dniCliente = leer.nextLong();
        System.out.println("");
        System.out.println("INGRESE Saldo: ");
        double saldoActual = leer.nextDouble();
        System.out.println("");
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    
    public CuentaBancaria ingresarDinero(CuentaBancaria cb){
        double saldo = cb.getSaldoActual();
        System.out.println("SALDO DISPONIBLE: "+saldo);
        System.out.println("");
        System.out.println("CUANTO DESEA INGRESAR?");
        double ingreso = leer.nextDouble();
        cb.setSaldoActual(saldo+ingreso);
        System.out.println("SALDO: "+cb.getSaldoActual());
        System.out.println("");
        return cb;
    }
    
    
    public CuentaBancaria retirarDinero(CuentaBancaria cb){
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
        System.out.println("SALDO: "+cb.getSaldoActual());
        System.out.println("");
        return cb;
    }
    
    
    public CuentaBancaria retiroRapido(CuentaBancaria cb){
        double saldo = cb.getSaldoActual();
        System.out.println("SALDO DISPONIBLE: " + saldo);
        System.out.println("");
        System.out.println("RETIRANDO 20% DEL SALDO: ");
        double retiro = (saldo*0.2);
        cb.setSaldoActual(saldo-retiro);
        System.out.println(retiro);
        System.out.println("");
        System.out.println("SALDO: "+cb.getSaldoActual());
        System.out.println("");
        return cb;
    }
    
    
    public CuentaBancaria consultaSaldo(CuentaBancaria cb){
        System.out.println("SALDO DISPONIBLE: "+cb.getSaldoActual());
        System.out.println("");
        return cb;
    }
    
    
    public CuentaBancaria datosUsuario(CuentaBancaria cb){
        System.out.println(cb.toString());
        System.out.println("");
        return cb;
    }
    
    
}
