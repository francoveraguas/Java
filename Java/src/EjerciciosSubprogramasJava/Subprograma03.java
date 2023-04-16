/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosSubprogramasJava;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Subprograma03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double euro;
        String moneda;
        
        System.out.println("INGRESE EUROS A CONVERTIR:");
        euro = leer.nextInt();
        System.out.println("");
        System.out.println("SELECCIONE MONEDA DE SALIDA:");
        System.out.println("");
        System.out.println("1 - LIBRA");
        System.out.println("2 - DOLAR");
        System.out.println("3 - YEN");
        System.out.println("");
        moneda = leer.next();
        
        convertir(euro, moneda);
        
    }
    
    public static void convertir(double euro, String moneda){
        switch(moneda){
            case "libra":
                double libra = euro * 0.86;
                System.out.println(euro + " EUROS EQUIVALEN A " + libra + " LIBRAS.");
                break;
            case "dolar":
                double dolar = euro * 1.28611;
                System.out.println(euro + " EUROS EQUIVALEN A " + dolar + " DOLARES.");
                break;
            case "yen":
                double yen = euro * 129.852;
                System.out.println(euro + " EUROS EQUIVALEN A " + yen + " YENES.");
                break;
                
        }
    }
}
