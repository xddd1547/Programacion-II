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

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;       
    private List<Autor> autores;      
    private List<Prestamo> prestamos; 
    private Horario horario;

    public Biblioteca(String nombre, String diasApertura, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
        this.autores = new ArrayList<Autor>();
        this.prestamos = new ArrayList<Prestamo>();
        this.horario = new Horario(diasApertura, horaApertura, horaCierre);
    }

    public void agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
            System.out.println("Se agrego el libro: " + libro.getTitulo());
        }
    }

    public void agregarAutor(Autor autor) {
        if (!autores.contains(autor)) {
            autores.add(autor);
            System.out.println("Se registro al autor: " + autor.getNombre());
        }
    }

    public void prestarLibro(String fechaP, String fechaDe, Estudiante estudiante, Libro libro) {
        if (!libros.contains(libro)) {
            System.out.println("El libro ==" + libro.getTitulo() + "== No se encuentra");
            return;
        }
        Prestamo p = new Prestamo(fechaP, fechaDe, estudiante, libro);
        prestamos.add(p);
        System.out.println("Se presto el libro = " + libro.getTitulo() + " al estudiante " + estudiante.getNombre());
    }

    public void mostrar() {
        System.out.println("Biblioteca = " + nombre);
        horario.mostrarHorario();

        System.out.println("Libros en catalogo = " + libros.size());
        for (Libro l : libros) {
            System.out.println(" - " + l.getTitulo() + " (ISBN: " + l.getIsbn() + ")");
        }

        System.out.println("Autores registrados: " + autores.size());
        for (Autor a : autores) {
            a.mostrarInfo();
        }

        System.out.println("Prestamos activos: " + prestamos.size());
        for (Prestamo pr : prestamos) {
            pr.mostrarInfo();
        }
    }

    public void cerrarBiblioteca() {
        System.out.println("La biblioteca '" + nombre + "' esta cerrando. Todos los prestamos se cancelan.");
        prestamos.clear();
    }
}
