package practicafelip;

import java.util.Scanner;

class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public double getRaiz1() {
        if (getDiscriminante() < 0) return 0;
        return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public double getRaiz2() {
        if (getDiscriminante() < 0) return 0;
        return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
    }
}

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);
        double disc = eq.getDiscriminante();
        if (disc > 0) {
            System.out.println("La ecuacion tiene dos raices " + eq.getRaiz1() + " y " + eq.getRaiz2());
        } else if (disc == 0) {
            System.out.println("La ecuacion tiene una raiz " + eq.getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}
