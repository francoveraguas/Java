/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejerciciodeaprendizaje01.entidades;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Libro {
    
    public String isbn;
    public String titulo;
    public String autor;
    public String paginas;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, String paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void crearLibro(){
        System.out.println("INGRESE TITULO DEL LIBRO: ");
        titulo= leer.next();
        System.out.println("INGRESE AUTOR: ");
        autor = leer.next();
        System.out.println("INGRESE ISBN DEL LIBRO: ");
        isbn = leer.next();
        System.out.println("INGRESE CANTIDAD DE PAGINAS: ");
        paginas = leer.next();
    }
    
    public void mostrarLibro(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(isbn);
        System.out.println(paginas);
    }
}
