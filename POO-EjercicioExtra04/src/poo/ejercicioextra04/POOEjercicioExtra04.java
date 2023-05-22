/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicioextra04;

import java.util.Scanner;
import poo.ejercicioextra04.banco.Cuenta;

/**
 *
 * @author Franco
 */
public class POOEjercicioExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("RED LINK - BIENVENIDO");
        System.out.println("");
        System.out.println("CARGANDO SISTEMA, AGUARDE...");
        Cuenta ct = new Cuenta();
        ct.cargarTitular();
        System.out.println("CARGADO CORRECTAMENTE");
        System.out.println("");
        ct.retirarDinero();
        System.out.println("");
        
    }
    
}
