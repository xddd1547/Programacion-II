package practica6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.io.File;

public class Biblioteca implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre, String diasApertura, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
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
            System.out.println("El libro == " + libro.getTitulo() + " == No se encuentra");
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
            System.out.println("- " + l.getTitulo() + " (ISBN: " + l.getIsbn() + ")");
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

    public List<Libro> getLibros() { 
        return libros; 
    }
    
    public List<Autor> getAutores() { 
        return autores; 
    }
    
    public List<Prestamo> getPrestamos() { 
        return prestamos; 
    }
    
    public Horario getHorario() { 
        return horario; 
    }
    
    public String getNombre() { 
        return nombre; 
    }

    public void guardarEstado(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
            System.out.println("Estado guardado en: " + fileName);
        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }
    }

    public static Biblioteca cargarEstado(String fileName) {
        Biblioteca bib = null;
        File f = new File(fileName);
        if (!f.exists()) {
            return null;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            bib = (Biblioteca) ois.readObject();
            System.out.println("Estado cargado desde: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar: " + e.getMessage());
        }
        return bib;
    }
}
