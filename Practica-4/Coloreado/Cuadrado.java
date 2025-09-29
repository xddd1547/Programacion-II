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
public class Cuadrado extends Figura implements Coloreado {
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String comoColorear() {
        return "Colorear los cuatro lados.";
    }

    @Override
    public String toString() {
        return "Cuadrado | " + super.toString() + " | Lado: " + lado;
    }
}
