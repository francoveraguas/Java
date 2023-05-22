/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicioextra04.banco;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Cuenta {
    Scanner leer = new Scanner(System.in);
    private String titular;
    private double saldo;
    
    public void cargarTitular(){
        System.out.println("INGRESE DNI:");
        titular = leer.next();
        switch(titular){
            case "36357357":
               titular = "VERAGUAS, FRANCO DAVID";
               break;
            case "33535320":
                titular = "ARMANDO, NOELIA JESICA";
                break;
        }
    }
    public void retirarDinero(){
        double retiro;
        String rta = "S";
        System.out.println("TITULAR DE CUENTA: "+titular);
        System.out.println("");
        System.out.println("INGRESE SU SALDO PARA OPERAR: ");
        saldo = leer.nextDouble();
        System.out.println("");
        
        do{
        System.out.println("INGRESE CANTIDAD A RETIRAR: ");
        retiro = leer.nextDouble();
            System.out.println("");
            
        if(retiro <= saldo && saldo > 0){
            saldo = saldo-retiro;
            }
        System.out.println("SALDO: "+saldo);
        if(saldo > 0){
            System.out.println("DESEA RETIRAR MAS DINERO?");
            System.out.println("S - Si");
            System.out.println("N - No");
            rta = leer.next();
            System.out.println("");
        } else if(saldo == 0) { 
            System.out.println("SALDO EN 0");
            System.out.println("");
               } else { 
            System.out.println("NO DISPONE DE SUFICIENTES FONDOS...");
            System.out.println("");
               }
        } while(saldo > 0 && rta.equalsIgnoreCase("S"));
        System.out.println("SALDO: "+saldo);
        System.out.println("SALIENDO DEL SISTEMA...");
               
    }
}
