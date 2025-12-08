/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Liz
 */
public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();

        //A
        consultorio.darAltaMedicosConsultas();
        consultorio.mostrarMedicos();
        consultorio.mostrarConsultas();

        //b
        consultorio.darBajaMedico("Juan", "Perez");
        consultorio.mostrarMedicos();
        consultorio.mostrarConsultas();

        //c
        consultorio.cambiarDiaNavidadAnioNuevo(10);
        consultorio.mostrarConsultas();

        //D
        consultorio.mostrarPacientesCumpleaños(20, "Enero");

    }
}
//el dia miercoles venir, subir a github