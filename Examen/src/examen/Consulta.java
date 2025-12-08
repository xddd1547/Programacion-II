/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Liz
 */

public class Consulta {
    private int ci;
    private String nombrePaciente;
    private String apellidoPaciente;
    private int idMed;
    private int dia;
    private String mes;
    private int anio;

    public Consulta(int ci, String nombrePaciente, String apellidoPaciente, int idMed, int dia, String mes, int anio) {
        this.ci = ci;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.idMed = idMed;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getCi() { 
        return ci; 
    }
    public String getNombrePaciente() { 
        return nombrePaciente; 
    }
    public String getApellidoPaciente() {
        return apellidoPaciente; 
    }
    public int getIdMed() {
        return idMed; 
    }
    public int getDia() {
        return dia; 
    }
    public String getMes() {
        return mes; 
    }
    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) { 
        this.dia = dia;
    }
    public void setMes(String mes) {
        this.mes = mes; 
    }
    public void setAnio(int anio) {
        this.anio = anio; 
    }

    @Override
    public String toString() {
        return "Consulta{" +"ci=" + ci +", nombrePaciente='" + nombrePaciente + '\'' +", apellidoPaciente='" + apellidoPaciente + '\'' +", idMed=" + idMed +", dia=" + dia +", mes='" + mes + '\'' +", anio=" + anio +'}';
    }
}