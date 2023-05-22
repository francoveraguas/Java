/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseservicio03.entidades.servicios;

import guia.pkg08.poo.ejercicioclaseservicio03.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class PersonaServicios {
    private Scanner leer = new Scanner(System.in);
    int mayorEdad = 0;
    int menorEdad = 0;
    
    
    public Persona crearPersona() {
        boolean comprobacion = false;
        int edad;
        String genero;
        double peso;
        double altura;
                
        System.out.println("INGRESE NOMBRE:");
        String nombre = leer.next();
        
        System.out.println("");
        System.out.println("INGRESE EDAD:");
        edad = leer.nextInt();
        if(edad >= 18){
            mayorEdad = mayorEdad+1;
        } else {
            menorEdad = menorEdad+1;
        }
        
        System.out.println("");
        do{
        System.out.println("INGRESE SEXO:");
        System.out.println(" -H- HOMBRE");
        System.out.println(" -M- MUJER");
        genero = leer.next();
        if(genero.equalsIgnoreCase("H") || genero.equalsIgnoreCase("M")){
            comprobacion = true;
        } else {
            System.out.println("HA INTRODUCIDO UN CARACTER INCORRECTO");
            comprobacion = false;
        }
        }while(comprobacion == false); 
        
        if(genero.equalsIgnoreCase("H")){
            genero = "HOMBRE";
        } else {
            genero = "MUJER";
        }
        
        System.out.println("");
        System.out.println("INGRESE PESO:");
        peso = leer.nextDouble();
        
        System.out.println("");
        System.out.println("INGRESE ALTURA:");
        altura = leer.nextDouble();
        
        return new Persona(nombre, edad, genero, peso, altura);
    }
    
    
    public void mostrarPersona(Persona auxiliarMostrar){
        
        System.out.println("NOMBRE: "+ auxiliarMostrar.getNombre());
        System.out.println("EDAD: "+auxiliarMostrar.getEdad());
        System.out.println("GENERO: "+auxiliarMostrar.getGenero());
        System.out.println("PESO: "+auxiliarMostrar.getPeso());
        System.out.println("ALTURA: "+auxiliarMostrar.getAltura());
        
        }
    
    
    public int calcularIMC(Persona auxiliarIMC){
        int resultado = (int)(auxiliarIMC.getPeso()/(auxiliarIMC.getAltura()*auxiliarIMC.getAltura()));
        int retorno = 0;
        
        if(resultado < 20){
            System.out.println("NOMBRE: "+auxiliarIMC.getNombre());
            System.out.println("");
            System.out.println("IMC = POR DEBAJO DEl PESO IDEAL.");
            System.out.println("");
            retorno = -1;
        } else if(resultado >= 20 && resultado <= 25){
            System.out.println("NOMBRE: "+auxiliarIMC.getNombre());
            System.out.println("");
            System.out.println("IMC = ESTA EN EL PESO IDEAL.");
            System.out.println("");
            retorno = 0;
        } else if(resultado > 25){
            System.out.println("NOMBRE: "+auxiliarIMC.getNombre());
            System.out.println("");
            System.out.println("IMC = POR ARRIBA DEl PESO IDEAL.");
            System.out.println("");
            retorno = 1;
        }
        return retorno;
    }
    
    
    public void mayoriaEdad(){
        
            System.out.println("");
            System.out.println("PORCENTAJES EDAD:");
            System.out.println("MAYOR DE EDAD: "+((mayorEdad*100)/5)+" %");
            System.out.println("MENOR DE EDAD: "+((menorEdad*100)/5)+" %");
            System.out.println("");
        }
}
   

