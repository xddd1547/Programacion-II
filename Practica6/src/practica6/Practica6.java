/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author Liz
 */
public class Practica6 {
    public static void main(String[] args) {
        Libro li1 = new Libro("Informatica", "978-1",
                new String[]{"Portada", "Contenido pagina 1", "Contenido pagina 2"});
        Libro li2 = new Libro("Guia de Programacion", "978-2",
                new String[]{"Portada", "Capitulo 1", "Capitulo 2", "Indice"});

        Biblioteca biblioteca = new Biblioteca("Biblioteca UMSA", "Lunes-Viernes", "08:00", "18:00");

        Autor a1 = new Autor("Emily Mayta", "Bolivia");
        Autor a2 = new Autor("Carlos Rojas", "Argentina");

        biblioteca.agregarAutor(a1);
        biblioteca.agregarAutor(a2);
        biblioteca.agregarLibro(li1);
        biblioteca.agregarLibro(li2);

        biblioteca.mostrar();

        Estudiante estudiante = new Estudiante("11475", "Juana Cornejo");
        biblioteca.prestarLibro("2025-12-02", "2025-12-09", estudiante, li1);

        System.out.println("== LEYENDO LIBRO ==");
        li1.leer();

        biblioteca.guardarEstado("biblioteca.dat");
        biblioteca.cerrarBiblioteca();
        biblioteca.mostrar();
    }
}