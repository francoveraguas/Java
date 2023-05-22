/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseutilidades02.servicios;

import guia.pkg08.poo.ejercicioclaseutilidades02.entidades.ParDeNumeros;

/**
 *
 * @author Franco
 */
public class ParDeNumerosServicios {
    double num1;
    double num2;
    
    public void mostrarNumeros(ParDeNumeros pdn){
        
        System.out.println("NUMERO 1: "+pdn.getNum1());
        System.out.println("NUMERO 2: "+pdn.getNum2());
        System.out.println("");
    }
    
    
    public double devolverMayor(ParDeNumeros pdn){
        return Math.max(pdn.getNum1(), pdn.getNum2());
    }
    
    
    public void calcularPotencia(ParDeNumeros pdn){
        double max = Math.round(Math.max(pdn.getNum1(), pdn.getNum2()));
        double min = Math.round(Math.min(pdn.getNum1(), pdn.getNum2()));
        System.out.println(max+" ELEVADO A [ "+min+" ] ES: "+Math.pow(max, min));
        System.out.println("");
    }
    
    
    public void calcularRaiz(ParDeNumeros pdn){
        double min = Math.abs(Math.min(pdn.getNum1(), pdn.getNum2()));
        System.out.println("RAIZ CUADRADA DE [ "+min+" ]: "+Math.sqrt(min));
        System.out.println("");
    }
    
    
    public void resetearNumeros(ParDeNumeros pdn){
        pdn.setNum1(num1=Math.round((Math.random()*10)*100.0)/100.0);
        pdn.setNum2(num2=Math.round((Math.random()*10)*100.0)/100.0);
        System.out.println("NUEVOS NUMEROS GENERADOS");
        System.out.println("");
    }
}
