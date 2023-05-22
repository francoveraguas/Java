/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicioextra02;

import java.util.Scanner;
import poo.ejercicioextra02.simbolos.Puntos;

/**
 *
 * @author Franco
 */
public class POOEjercicioExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO");
        System.out.println("VAMOS A CALCULAR LA DISTANCIA ENTRE DOS PUNTOS");
        System.out.println("");
        System.out.println("INICIANDO PROGRAMA...");
        System.out.println("");
        Puntos pt = new Puntos();
        System.out.println("");
        System.out.println("CARGADO CORRECTAMENTE...");
        pt.crearPuntos();
        System.out.println("");
        pt.calcularDistancia();
        System.out.println("DISTANCIA ENTRE PUNTOS: "+pt.calcularDistancia());
    }
    
}
