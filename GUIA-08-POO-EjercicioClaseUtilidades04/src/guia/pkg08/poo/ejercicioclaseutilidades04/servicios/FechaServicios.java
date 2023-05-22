/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades04.servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class FechaServicios {
    private Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        System.out.println("COMPLETE LOS DATOS PARA CONTINUAR");
        System.out.println("INGRESE AÑO: ");
        int año = (leer.nextInt())-1900;
        System.out.println("INGRESE MES: ");
        int mes = (leer.nextInt())-1;
        System.out.println("INGRESE DIA: ");
        int dia = leer.nextInt();
        
        return new Date(año, mes , dia);
    }
    
    
    public Date fechaActual(){
        return new Date();
    }
    
    
    public void calcularEdad(Date fechaNacimiento, Date fechaActual){
        if(fechaActual.getMonth() > fechaNacimiento.getMonth()){
        System.out.println("SU EDAD ES: "+(fechaActual.getYear()-fechaNacimiento.getYear()));
        } else {
        System.out.println("SU EDAD ES: "+((fechaActual.getYear()-fechaNacimiento.getYear())-1));    
        }
    }
}
