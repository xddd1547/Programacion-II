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

public class Autor implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Autor = " + nombre);
        System.out.println("Nacionalidad = " + nacionalidad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Autor autor = (Autor) obj;
        return nombre.equals(autor.nombre) && nacionalidad.equals(autor.nacionalidad);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + nacionalidad.hashCode();
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
}