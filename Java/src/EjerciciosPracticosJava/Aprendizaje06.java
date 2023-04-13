/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticosJava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Franco
 */
public class Aprendizaje06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros enteros positivos: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - SALIR");
        System.out.println("");
        
        int opcion = leer.nextInt();
        String resp = "N";
        do{
            resp = "N";
        switch(opcion){
            case 1:
               int suma = num1+num2;
                System.out.println("LA SUMA ES: " + suma);
                break;
            case 2:
                int resta = num1-num2;
                System.out.println("LA RESTA ES: " + resta);
                break;
            case 3:
                int mult = num1*num2;
                System.out.println("LA MULTIPLICACION ES: " + mult);
                break;
            case 4:
                double div = num1/num2;
                System.out.println("LA DIVISION ES: " + div);
                break;
            case 5:
                System.out.println("SEGURO DESEA SALIR?");
                System.out.println("S - SI");
                System.out.println("N - NO");
                resp = leer.next();
                resp = toUpperCase(resp);
                if("S".equals(resp)){
                System.out.println("SALIENDO DEL SISTEMA...");
                break;
                } else {
                    System.out.println("INGRESE UNA OPCION: ");
                    opcion = leer.nextInt();
                continue;
                }
            default:
                System.out.println("OPCION INCORRECTA. SALIENDO...");
                break;
            }
            if(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4){
                System.out.println("INGRESE OPCION PARA CONTINUAR");
                System.out.println("");
                opcion = leer.nextInt();
            }
        } while(opcion < 5 || "N".equals(resp));
    }
    
}
