/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg08.poo.ejercicioclaseservicio02.servicios;

import guia.pkg08.poo.ejercicioclaseservicio02.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class CafeteraServicios {
    private Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        double capacidadActual = 0;
        
        System.out.println("INGRESE CANTIDAD DE MEDIDAS DE CAFE: ");
        int medidasCafe = leer.nextInt();
        System.out.println("");
        System.out.println("CAPACIDAD DE AGUA RECOMENDADA PARA "+medidasCafe+" MEDIDAS: ");
        System.out.println((medidasCafe*100)+" CC.");
        System.out.println("");
        System.out.println("CONFIRMA CAPACIDAD O INGRESA MANUALMENTE: ");
        System.out.println(" -1- CONFIRMAR");
        System.out.println(" -2- INGRESAR");
        String rta = leer.next();
        if(rta.equals("1")){
            System.out.println("AGREGANDO CANTIDAD IDEAL DE AGUA...");
            capacidadActual = (medidasCafe*100); 
            System.out.println("PREPARACION: CAFE EQUILIBRADO");
        } else if (rta.equals("2")){
            System.out.println("INGRESE CANTIDAD DE AGUA DESEADA: ");
            capacidadActual = leer.nextDouble();
            System.out.println("");
            if(capacidadActual < (medidasCafe*100)){
                System.out.println("PREPARACION: CAFE INTENSO");
            } else if(capacidadActual > (medidasCafe*100)){
                System.out.println("PREPARACION: CAFE SUAVE");
            }
        }
        System.out.println("CANTIDAD DE CAFE PREPARADO: "+capacidadActual+" CC.");
        System.out.println("");
        return new Cafetera(medidasCafe, capacidadActual);
    }
    
    
    public Cafetera llenarCafetera(Cafetera cf){
        double dif;
        
        System.out.println("CANTIDAD DE CAFE PREPARADO: "+cf.getCapacidadActual()+" CC");
        System.out.println("");
        dif = (1200-cf.getCapacidadActual());
        System.out.println("LLENANDO CAFETERA..."); 
        cf.setCapacidadActual(cf.getCapacidadActual()+dif);
        System.out.println("");
        System.out.println("CAFETERA COMPLETA. CANTIDAD TOTAL: "+cf.getCapacidadMaxima()+" CC.");
        System.out.println("PREPARACION: CAFE IDEAL");
        System.out.println("");
        return cf;
    }
    
    
    public Cafetera servirTaza(Cafetera cf){
        int rta;
        double cant;
        
        do{
        System.out.println(" -INDIQUE TAMAÑO DE TAZA- ");
        System.out.println(" -1- CHICA [100cc] ");
        System.out.println(" -2- MEDIANA [200cc] ");
        System.out.println(" -3- GRANDE [300cc] ");
        System.out.println(" -4- VOLVER A MENU PRINCIPAL ");
        System.out.println("");
        rta = leer.nextInt();
        System.out.println("");
        switch (rta) {
            case 1:
                cant = cf.getCapacidadActual();
                if(100 <= cant && cant > 0){
                    System.out.println("SIRVIENDO TAZA PEQUEÑA...");
                    cf.setCapacidadActual(cant-100);
                    System.out.println("");
                    System.out.println("CANTIDAD RESTANTE DE CAFE: "+cf.getCapacidadActual()+" CC");
                    System.out.println("");
                } else if(cant == 0) {
                    System.out.println("NO HAY CAFE PREPARADO");
                    System.out.println("");
                    rta = 4;
                } else if(100 > cant && cant > 0){
                    System.out.println("INSUFICIENTE PARA LLENAR TAZA.");
                    System.out.println("SIRVIENDO CAFE RESTANTE...");
                    System.out.println("CAFE SERVIDO: "+cf.getCapacidadActual()+" cc");
                    cf.setCapacidadActual(cf.getCapacidadActual()-cant);
                    System.out.println("");
                    System.out.println("CANTIDAD RESTANTE DE CAFE: "+cf.getCapacidadActual()+" CC");
                    System.out.println("");
                    rta = 4;
                }
                break;
            case 2:
                cant = cf.getCapacidadActual();
                if(200 <= cant && cant > 0){
                    System.out.println("SIRVIENDO TAZA MEDIANA...");
                    cf.setCapacidadActual(cant-200);
                    System.out.println("");
                    System.out.println("CANTIDAD RESTANTE DE CAFE: "+cf.getCapacidadActual()+" CC");
                    System.out.println("");
                } else if(cant == 0) {
                    System.out.println("NO HAY CAFE PREPARADO");
                    System.out.println("");
                    rta = 4;
                } else if(200 > cant && cant > 0){
                    System.out.println("INSUFICIENTE PARA LLENAR TAZA.");
                    System.out.println("SIRVIENDO CAFE RESTANTE...");
                    System.out.println("CAFE SERVIDO: "+cf.getCapacidadActual()+" cc");
                    cf.setCapacidadActual(cf.getCapacidadActual()-cant);
                    System.out.println("");
                    System.out.println("CANTIDAD RESTANTE DE CAFE: "+cf.getCapacidadActual()+" CC");
                    System.out.println("");
                    rta = 4;
                }
                break;
            case 3:
                cant = cf.getCapacidadActual();
                if(300 <= cant && cant > 0){
                    System.out.println("SIRVIENDO TAZA GRANDE...");
                    cf.setCapacidadActual(cant-300);
                    System.out.println("");
                    System.out.println("CANTIDAD RESTANTE DE CAFE: "+cf.getCapacidadActual()+" CC");
                    System.out.println("");
                } else if(cant == 0) {
                    System.out.println("NO HAY CAFE PREPARADO");
                    System.out.println("");
                    rta = 4;
                } else if(300 > cant && cant > 0){
                    System.out.println("INSUFICIENTE PARA LLENAR TAZA.");
                    System.out.println("SIRVIENDO CAFE RESTANTE...");
                    System.out.println("");
                    System.out.println("CAFE SERVIDO: "+cf.getCapacidadActual()+" cc");
                    cf.setCapacidadActual(cf.getCapacidadActual()-cant);
                    System.out.println("");
                    System.out.println("CANTIDAD RESTANTE DE CAFE: "+cf.getCapacidadActual()+" CC");
                    System.out.println("");
                    rta = 4;
                }
                break;
            case 4:
                System.out.println("");
                break;
            }
        } while(rta < 4);
        
        System.out.println("VOLVIENDO A MENU PRINCIPAL");
        System.out.println("");
        return cf;
    }
    
    
    public Cafetera vaciarCafetera(Cafetera cf){
        System.out.println("AGUARDE");
        System.out.println("VACIANDO CAFETERA...");
        System.out.println("");
        cf.setCapacidadActual(0);
        System.out.println("VACIADO CORRECTAMENTE");
        System.out.println("REGRESANDO A MENU PRINCIPAL...");
        System.out.println("");
        return cf;
    }
    
    
    public Cafetera agregarCafe(Cafetera cf){
        double resto = (cf.getCapacidadMaxima()-cf.getCapacidadActual());
        double cant;
        System.out.println("CANTIDAD RESTANTE DE CAFE: "+cf.getCapacidadActual());
        System.out.println("");
        System.out.println("CANTIDAD MAXIMA A AGREGAR: "+resto+" CC");
        System.out.println("");
        System.out.println("AGREGA SOLO AGUA O CAFE Y AGUA?");
        System.out.println("");
        System.out.println(" -1- SOLO AGUA");
        System.out.println(" -2- CAFE Y AGUA");
        System.out.println("");
        int rta = leer.nextInt();
        switch(rta){
            case 1:
                System.out.println("INDIQUE CANTIDAD DE AGUA A AGREGAR:");
                cant = leer.nextDouble();
                while(cant > resto){
                    System.out.println("EXCEDE LA CAPACIDAD MAXIMA DE LA CAFETERA");
                    System.out.println("INDIQUE CANTIDAD DE AGUA A AGREGAR:");
                    cant = leer.nextDouble();                    
                }
                cf.setCapacidadActual(cf.getCapacidadActual()+cant);
                System.out.println("");
                System.out.println("AGREGANDO AGUA...");
                System.out.println("");
                System.out.println("CANTIDAD DE CAFE PREPARADO: "+cf.getCapacidadActual()+" CC");
                System.out.println("");
                System.out.println("REGRESANDO A MENU PRINCIPAL...");
                System.out.println("");
                break;
            case 2:
                System.out.println("INGRESE CANTIDAD DE MEDIDAS DE CAFE: ");
                int medidasCafe = leer.nextInt();
                System.out.println("");
                System.out.println("CAPACIDAD DE AGUA RECOMENDADA PARA "+medidasCafe+" MEDIDAS: ");
                System.out.println((medidasCafe*100)+" CC.");
                System.out.println("");
                System.out.println("CONFIRMA CAPACIDAD O INGRESA MANUALMENTE: ");
                System.out.println(" -1- CONFIRMAR");
                System.out.println(" -2- INGRESAR");
                String rta1 = leer.next();
                if(rta1.equals("1")){
                System.out.println("AGREGANDO CANTIDAD IDEAL DE AGUA...");
                cf.setCapacidadActual((medidasCafe*100)); 
                System.out.println("PREPARACION: CAFE EQUILIBRADO");
                } else if (rta1.equals("2")){
                System.out.println("INGRESE CANTIDAD DE AGUA DESEADA: ");
                cf.setCapacidadActual(leer.nextDouble());
                System.out.println("");
                if(cf.getCapacidadActual() < (medidasCafe*100)){
                System.out.println("PREPARACION: CAFE INTENSO");
                } else if(cf.getCapacidadActual() > (medidasCafe*100)){
                System.out.println("PREPARACION: CAFE SUAVE");
                System.out.println("CANTIDAD DE CAFE PREPARADO: "+cf.getCapacidadActual()+" CC.");
                System.out.println("");
                break;
                }
            }
        
        }
        return cf;       
    }
}
