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
public class Subprograma01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros para operar: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("");
        System.out.println("QUE OPERACION DESEA REALIZAR: ");
        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        int resp = leer.nextInt();
        
        if(resp == 1){
            int retorno = sumar(num1, num2);
            System.out.println("LA SUMA ES: " + retorno);
        } else if(resp == 2){
            int retorno = restar(num1, num2);
            System.out.println("LA RESTA ES: " + retorno);
        } else if(resp == 3){
            int retorno = multiplicar(num1, num2);
            System.out.println("LA MULTIPLICACION ES: " + retorno);
        } else if(resp == 4){
            int retorno = dividir(num1, num2);
            System.out.println("LA DIVISION ES: " + retorno);
        } else {
            System.out.println("HA INGRESADO UNA OPCION INCORRECTA...");
            System.out.println("SALIENDO DEL SISTEMA...");
            System.out.println("");
        }
    }
  public static int sumar(int num1, int num2){
    int suma = num1 + num2;
    return suma;
  } 
  public static int restar(int num1, int num2){
      int resta = num1 - num2;
      return resta;
  }
  public static int multiplicar(int num1, int num2){
      int multiplicacion = num1 * num2;
      return multiplicacion;
  }
  public static int dividir(int num1, int num2){
      int division = num1 / num2;
      return division;
  }
}