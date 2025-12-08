/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Liz
 */
import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    private List<Medico> medicos;
    private List<Consulta> consultas;

    public Consultorio() {
        this.medicos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    //a
    public void darAltaMedicosConsultas() {
        medicos.add(new Medico(1, "Juan", "Perez", 5));
        medicos.add(new Medico(2, "Ana", "Gomez", 8));
        medicos.add(new Medico(3, "Carlos", "Lopez", 3));

        consultas.add(new Consulta(1001, "Maria", "Fernandez", 1, 15, "Diciembre", 2025));
        consultas.add(new Consulta(1002, "Pedro", "Ramirez", 1, 25, "Diciembre", 2025));
        consultas.add(new Consulta(1003, "Lucia", "Torres", 1, 1, "Enero", 2026));
        consultas.add(new Consulta(1004, "Jorge", "Mendoza", 2, 10, "Enero", 2026));
        consultas.add(new Consulta(1005, "Sofia", "Cortes", 2, 20, "Diciembre", 2025));
        consultas.add(new Consulta(1006, "Diego", "Ruiz", 2, 30, "Diciembre", 2025));
        consultas.add(new Consulta(1007, "Valentina", "Ortiz", 3, 5, "Enero", 2026));
        consultas.add(new Consulta(1008, "Alejandro", "Castro", 3, 15, "Diciembre", 2025));
        consultas.add(new Consulta(1009, "Camila", "Vargas", 3, 25, "Enero", 2026));

        System.out.println("Medicos y consultas dados de alta.");
    }

// B
public void darBajaMedico(String nombreX, String apellidoY) {
    int idMedico = -1;
    boolean encontrado = false;

    for (Medico m : medicos) {
        if (m.getNombreMed().equals(nombreX) && m.getApellidoMed().equals(apellidoY)) {
            idMedico = m.getIdMed();
            encontrado = true;
            break;
        }
    }

    if (encontrado) {

        final int idFinal = idMedico;
        consultas.removeIf(c -> c.getIdMed() == idFinal);
        System.out.println("Medico =" + nombreX + " " + apellidoY + "= dado de baja =sus consultas han sido eliminadas=.");
    } else {
        System.out.println("Medico no encontrado.");
    }
}
    //C
    public void cambiarDiaNavidadAnioNuevo(int nuevoDia) {
        for (Consulta c : consultas) {
            if ((c.getMes().equalsIgnoreCase("Diciembre") && c.getDia() == 25) ||
                (c.getMes().equalsIgnoreCase("Enero") && c.getDia() == 1)) {
                c.setDia(nuevoDia);
                System.out.println("Consulta de " + c.getNombrePaciente() + " cambiada al dia " + nuevoDia);
            }
        }
        System.out.println("Dias actualizados para consultas de Navidad y Ano Nuevo.");
    }

    // d
    public void mostrarPacientesCumpleaños(int diaCumple, String mesCumple) {
        System.out.println("\n Pacientes atendidos en tu cumpleanos (" + diaCumple + " de " + mesCumple + "):");
        boolean encontrado = false;
        for (Consulta c : consultas) {
            if (c.getDia() == diaCumple && c.getMes().equalsIgnoreCase(mesCumple)) {
                System.out.println("- " + c.getNombrePaciente() + " " + c.getApellidoPaciente() + " (CI: " + c.getCi() + ")");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Ningun paciente atendido en esa fecha.");
        }
    }

    
    
    public void mostrarMedicos() {
        System.out.println("\n MEDICOS:");
        for (Medico m : medicos) {
            System.out.println(m);
        }
    }

    public void mostrarConsultas() {
        System.out.println("\n CONSULTAS:");
        for (Consulta c : consultas) {
            System.out.println(c);
        }
    }
}