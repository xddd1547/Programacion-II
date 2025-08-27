package practicafelip;

import java.util.Scanner;

public class estadisticaEstruc {
    public static double promedio(double[] datos) {
        double suma = 0;
        for (double num : datos) suma += num;
        return suma / datos.length;
    }

    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double suma = 0;
        for (double num : datos) suma += Math.pow(num - prom, 2);
        return Math.sqrt(suma / (datos.length - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];

        System.out.println("Ingrese 10 números: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
        }

        System.out.println("El promedio es " + promedio(nums));
        System.out.println("La desviación estándar es " + desviacion(nums));
    }
}
