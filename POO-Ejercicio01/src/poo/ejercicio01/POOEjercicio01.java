/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio01;

import Entidad.Persona;


/**
 *
 * @author Franco
 */
public class POOEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Franco", 30, "Masculino", 1.92);
        
        System.out.println(persona.nombre+" "+persona.edad+" "+persona.genero+" "+persona.altura);
    }
    
}
