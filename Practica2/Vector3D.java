/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac2;

/**
 *
 * @author Liz
 */public class Vector3D {
    private double x, y, z;
    private static final double EPS = 1e-8;

    // Constructor vacío
    public Vector3D() {
        this(0, 0, 0);
    }

    // Constructor con parámetros
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //a) Suma de dos vectores: c = a + b
    public Vector3D add(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    //b) Resta de dos vectores: c = a - b
    public Vector3D subtract(Vector3D v) {
        return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    //c) Multiplicación por escalar: b = r * a
    public Vector3D scalarMul(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }

    //d) Longitud de un vector: |a|
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    //e) Vector normalizado: b = a / |a|
    public Vector3D normalize() {
        double len = magnitude();
        if (len < EPS) return new Vector3D(0, 0, 0);
        return new Vector3D(this.x / len, this.y / len, this.z / len);
    }

    //f) Producto escalar: a · b
    public double dot(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    //g) Producto vectorial: a × b
    public Vector3D cross(Vector3D v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new Vector3D(cx, cy, cz);
    }

    // Comparación con tolerancia
    public boolean equals(Vector3D v) {
        return Math.abs(this.x - v.x) < EPS &&
               Math.abs(this.y - v.y) < EPS &&
               Math.abs(this.z - v.z) < EPS;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
