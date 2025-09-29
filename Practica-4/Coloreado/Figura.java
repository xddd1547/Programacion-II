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

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color: " + color;
    }

    public abstract double area();
    public abstract double perimetro();
}
