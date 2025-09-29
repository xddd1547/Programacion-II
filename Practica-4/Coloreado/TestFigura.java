/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac4.Coloreado;

/**
 *
 * @author Liz
 */
import java.util.Random;

public class TestFigura {
    public static void main(String[] args) {
        Random random = new Random();
        Figura[] figuras = new Figura[5];
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Negro"};

        for (int i = 0; i < figuras.length; i++) {
            int tipo = random.nextInt(2); // 0 = cuadrado, 1 = círculo
            String color = colores[random.nextInt(colores.length)];

            if (tipo == 0) {
                double lado = 1 + random.nextInt(10);
                figuras[i] = new Cuadrado(lado, color);
            } else {
                double radio = 1 + random.nextInt(10);
                figuras[i] = new Circulo(radio, color);
            }
        }

        System.out.println("--- Lista de Figuras ---");
        for (Figura f : figuras) {
            System.out.println(f.toString());
            System.out.println("Area: " + f.area());
            System.out.println("Perimetro: " + f.perimetro());
            if (f instanceof Coloreado) {
                System.out.println(((Coloreado) f).comoColorear());
            }
            System.out.println();
        }
    }
}
