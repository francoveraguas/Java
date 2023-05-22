/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades01;

import guia.pkg08.poo.ejercicioclaseutilidades01.entidades.Cadena;
import guia.pkg08.poo.ejercicioclaseutilidades01.servicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class GUIA08POOEjercicioClaseUtilidades01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicios cs = new CadenaServicios();
        int rta;
        String frase = null;
         
        System.out.println("BIENVENIDO");
        System.out.println("");
        System.out.println("UTILIDADES - JAVA");
        System.out.println("");
        System.out.println("CARGANDO PROGRAMA...");
        Cadena cd = cs.crearCadena();
        
        System.out.println("FRASE INGRESADA: " + cd.getFrase());
        System.out.println("LONGITUD DE FRASE: "+cd.getLongitud());
        System.out.println("");
        
        do{
        System.out.println(" -MENU- ");
        System.out.println(" -1- MOSTRAR VOCALES ");
        System.out.println(" -2- INVERTIR FRASE ");
        System.out.println(" -3- VECES REPETIDA [   ]");
        System.out.println(" -4- COMPARAR LONGITUD ");
        System.out.println(" -5- UNIR FRASES ");
        System.out.println(" -6- REEMPLAZAR LETRA [   ]");
        System.out.println(" -7- CONTIENE LETRA [   ] ");
        System.out.println(" -8- SALIR ");
        System.out.println("");
        rta = leer.nextInt();
        System.out.println("");
        
        switch (rta) {
            case 1:
                cs.mostrarVocales(cd);
                break;
            case 2:
                cs.invertirCadena(cd);
                break;
            case 3:
                cs.letraRepetida(cd);
                break;
            case 4:
                if(frase == null){
                    System.out.println("INGRESE OTRA FRASE PARA CONTINUAR: ");
                    frase = leer.next();
                }
                System.out.println("");
                cs.compararLongitud(cd, frase);
                break;
            case 5:
                if(frase == null){
                    System.out.println("INGRESE OTRA FRASE PARA CONTINUAR: ");
                    frase = leer.next();
                }
                System.out.println("");
                cs.unirCadenas(cd, frase);
                break;
            case 6:
                cs.reemplazarLetra(cd);
                break;
            case 7:
                cs.contieneLetra(cd);
                break;
            case 8:
                System.out.println("SALIENDO DEL SISTEMA...");
                break;
            }
        } while(rta < 8);
    }
        
}
