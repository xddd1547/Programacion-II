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
public class TestEmpleado {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[5];

        empleados[0] = new EmpleadoTiempoCompleto("Juan", 12000);
        empleados[1] = new EmpleadoTiempoCompleto("María", 18000);
        empleados[2] = new EmpleadoTiempoCompleto("Carlos", 24000);
        empleados[3] = new EmpleadoTiempoHorario("Ana", 160, 15);
        empleados[4] = new EmpleadoTiempoHorario("Luis", 200, 12);

        System.out.println("--- Lista de empleados ---");
        for (Empleado e : empleados) {
            System.out.println(e.toString() + " | Salario mensual: " + e.calcularSalarioMensual());
        }
    }
}
