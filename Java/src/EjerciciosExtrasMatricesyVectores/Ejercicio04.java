/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtrasMatricesyVectores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random random = new Random();   
        int alumnos[][] = new int[4][10];
        int promedioFinal[] = new int[10];  
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
            alumnos[i][j] = random.nextInt(10)+1;              
                }
        }
        System.out.println("NOTAS DE LOS 10 ALUMNOS: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print("-[" + (alumnos[i][j]) + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int j = 0; j < 10; j++) {
            double promNotaPrimerPractico = 0;
            double promNotaSegundoPractico = 0;
            double promNotaPrimerIntegrador = 0;
            double promNotaSegundoIntegrador = 0;
            
             for (int i = 0; i < 4; i++) {
                switch(j){
                     case 0:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[0] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                    case 1:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[1] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                    case 2:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[2] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                    case 3:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[3] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                    case 4:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[4] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                    case 5:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[5] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                    case 6:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[6] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                    case 7:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[7] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                    case 8:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[8] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                    case 9:
                         if(i == 0){
                        promNotaPrimerPractico = alumnos[i][j]*0.10;
                         } else if(i == 1){
                            promNotaSegundoPractico = alumnos[i][j]*0.15;
                         } else if(i == 2){
                            promNotaPrimerIntegrador = alumnos[i][j]*0.25; 
                         } else if(i == 3){
                            promNotaSegundoIntegrador = alumnos[i][j]*0.50;
                            promedioFinal[9] = (int)(promNotaPrimerPractico+promNotaSegundoPractico+promNotaPrimerIntegrador+promNotaSegundoIntegrador); 
                         } break;
                }
            }
        }
        System.out.println("PROMEDIOS FINALES:");
       for (int i = 0; i < 10; i++) {
            System.out.print("-[" + (promedioFinal[i]) + "]");
        }
        System.out.println("");
        int aprobados = 0;
        int desaprobados = 0;
                
        for (int i = 0; i < 10; i++) {
            if(promedioFinal[i] >= 7){
                aprobados = aprobados+1; 
            } else if(promedioFinal[i] <= 6){
                desaprobados = desaprobados+1;
            }
        }
        System.out.println("");
        System.out.println("ALUMNOS APROBADOS: " + aprobados);
        System.out.println("ALUMNOS DESAPROBADOS: " + desaprobados);
    }
}
    

