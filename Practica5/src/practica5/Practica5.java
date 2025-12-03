/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Liz
 */


public class Practica5 {

    public static void main(String[] args) {
        Autor a1 = new Autor("Emily Mayta", "Bolivia");
        Autor a2 = new Autor("Carlos Rojas", "Argentina");

        Libro li1 = new Libro("Informatica", "978-1",new String[]{"Portada", "Contenido pagina 1", "Contenido pagina 2"});
        Libro li2 = new Libro("Guia de Programacion", "978-2",new String[]{"Portada", "Capitulo 1", "Capitulo 2", "Indice"});

        Biblioteca biblioteca = new Biblioteca("Biblioteca UMSA", "Lunes-Viernes", "08:00", "18:00");

        biblioteca.agregarAutor(a1);
        biblioteca.agregarAutor(a2);
        biblioteca.agregarLibro(li1);
        biblioteca.agregarLibro(li2);

        Estudiante estudiante = new Estudiante("11475", "Juana Cornejo");

        biblioteca.mostrar();

        biblioteca.prestarLibro("","",estudiante, li1);

        System.out.println("== LEYENDO LIBRO ==");
        li1.leer();

        biblioteca.cerrarBiblioteca();
        biblioteca.mostrar();
    }
}
