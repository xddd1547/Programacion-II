/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac4.Empleado;

/**
 *
 * @author Liz
 */

public class EmpleadoTiempoHorario extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalarioMensual() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + " | Horas: " + horasTrabajadas + ", Tarifa: " + tarifaPorHora;
    }
}
