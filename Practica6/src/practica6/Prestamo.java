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
import java.io.Serializable;

public class Prestamo implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String fechaP, fechaDe;
    protected Libro libro;
    protected Estudiante estudiante;

    public Prestamo(String fechaP, String fechaDe, Estudiante estudiante, Libro libro) {
        this.fechaP = fechaP;
        this.fechaDe = fechaDe;
        this.libro = libro;
        this.estudiante = estudiante;
    }

    public void mostrarInfo() {
        System.out.println("Se presto libro: " + libro.getTitulo() + " al estudiante: " + estudiante.getNombre());
        System.out.println("Fecha prestamo: " + fechaP + " | Fecha devolucion: " + fechaDe);
    }
}