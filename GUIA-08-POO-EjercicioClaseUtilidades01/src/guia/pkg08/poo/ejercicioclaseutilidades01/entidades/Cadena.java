/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades01.entidades;

/**
 *
 * @author Franco
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        longitud = (int)frase.length();
    }

    public String getFrase() {
        return frase;
    }

    
    public void setFrase(String frase) {
        this.frase = frase;
        longitud = (int)frase.length();
    }

    
    public int getLongitud() {
        return longitud;
    }

}
