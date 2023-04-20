/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosArreglosJava;



import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;

/**
 *
 * @author Franco
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int digitos;
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        
        System.out.println("INGRESE TAMAÑO DE VECTOR:");
        int tamaño = leer.nextInt();
        String[] vector = new String[tamaño];
        
        for(int i = 0; i < tamaño; i++){
            vector[i] = String.valueOf(random.nextInt(100000));
        } 
        System.out.println("");
                
        for(int i = 0; i < tamaño; i++){
            digitos = (int)length(vector[i]);
            switch(digitos){
                case 1:
                    unDigito = unDigito + 1;
                    break;
                case 2:
                    dosDigitos = dosDigitos + 1;
                    break;
                case 3:
                    tresDigitos = tresDigitos + 1;
                    break;
                case 4:
                    cuatroDigitos = cuatroDigitos + 1;
                    break;
                case 5:
                    cincoDigitos = cincoDigitos + 1;
                    break;
            }
        } 
        System.out.println("");
        System.out.println("NUMEROS DE 1 DIGITO: " + unDigito);
        System.out.println("NUMEROS DE 2 DIGITOS: " + dosDigitos);
        System.out.println("NUMEROS DE 3 DIGITOS: " + tresDigitos);
        System.out.println("NUMEROS DE 4 DIGITOS: " + cuatroDigitos);
        System.out.println("NUMEROS DE 5 DIGITOS: " + cincoDigitos);
        System.out.println("");
    }
    
}
