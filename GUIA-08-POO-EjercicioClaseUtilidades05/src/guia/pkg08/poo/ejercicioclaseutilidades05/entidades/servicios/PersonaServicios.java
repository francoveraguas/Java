/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades05.entidades.servicios;

import guia.pkg08.poo.ejercicioclaseutilidades05.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class PersonaServicios {
    private Scanner leer = new Scanner(System.in);
    
    
    public Persona crearPersona(){
       System.out.println("INGRESE NOMBRE: ");
       String nombre = leer.next();
       System.out.println("");
       System.out.println("INGRESE FECHA DE NACIMIENTO: ");
       System.out.println("AÑO: ");
       int año = (leer.nextInt())-1900;
       System.out.println("");
       System.out.println("MES: ");
       int mes = (leer.nextInt())-1;
       System.out.println("");
       System.out.println("DIA: ");
       int dia = leer.nextInt();
       System.out.println("");
       Date fecha = new Date(año, mes, dia);
       
       return new Persona(nombre, fecha);
    } 
   
   
    public int calcularEdad(Persona ps){
       Date fechaActual = new Date();
        System.out.println(fechaActual);
        System.out.println("");
       Date fechaNacimiento = ps.getFechaNacimiento();
       int edad;
       
        if(fechaActual.getMonth() > fechaNacimiento.getMonth()){
            edad = (fechaActual.getYear()-fechaNacimiento.getYear());
        } else if(fechaActual.getMonth() == fechaNacimiento.getMonth() && fechaActual.getDate() >= fechaNacimiento.getDate()){
            edad = (fechaActual.getYear()-fechaNacimiento.getYear());
        } else {
            edad = ((fechaActual.getYear()-fechaNacimiento.getYear())-1);
        }
        System.out.println("");
        
        return edad;
    }
   
   
    public boolean menorQue(Persona ps, int edadConsulta){
        Date fechaActual = new Date();
        Date fechaNacimiento = ps.getFechaNacimiento();
        int edad;
        boolean retorno;
       
        if(fechaActual.getMonth() >= fechaNacimiento.getMonth() && fechaActual.getDay() >= fechaNacimiento.getDay()){
            edad = (fechaActual.getYear()-fechaNacimiento.getYear());
        } else {
            edad = ((fechaActual.getYear()-fechaNacimiento.getYear())-1);
        }
        
        if(edad < edadConsulta){
           retorno = true; 
        } else {
            retorno = false;
        }
        System.out.println("");
        
        return retorno;
    }
    
    
    public void mostrarPersona(Persona ps, int edad){
        System.out.println("NOMBRE: "+ps.getNombre());
        System.out.println("F.Nac: "+ps.getFechaNacimiento());
        System.out.println("EDAD: "+edad);
        System.out.println("");
    }
}
