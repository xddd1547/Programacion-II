/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

/**
 *
 * @author Liz
 */

public class Medico {
    private int idMed;
    private String nombreMed;
    private String apellidoMed;
    private int anosExperiencia;

    public Medico(int idMed, String nombreMed, String apellidoMed, int anosExperiencia) {
        this.idMed = idMed;
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.anosExperiencia = anosExperiencia;
    }
    
    public int getIdMed() { 
        return idMed; 
    }
    public String getNombreMed() { 
        return nombreMed; 
    }
    public String getApellidoMed() { 
        return apellidoMed;
    }
    public int getAnosExperiencia() {
        return anosExperiencia; 
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed; 
    }
    public void setApellidoMed(String apellidoMed) { 
        this.apellidoMed = apellidoMed; 
    }
    public void setAnosExperiencia(int anosExperiencia) { 
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Medico{" +"idMed=" + idMed +", nombreMed='" + nombreMed + '\'' +", apellidoMed='" + apellidoMed + '\'' +", anosExperiencia=" + anosExperiencia +'}';
    }
}