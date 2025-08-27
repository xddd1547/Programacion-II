package practicafelip;

import java.util.Scanner;

class Estadistica {
    private double[] datos;

    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double num : datos) suma += num;
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (double num : datos) suma += Math.pow(num - prom, 2);
        return Math.sqrt(suma / (datos.length - 1));
    }
}

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
        }
        Estadistica est = new Estadistica(nums);
        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviacion estandar es " + est.desviacion());
    }
}

