/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac2;

/**
 *
 * @author Liz
 */
public class Main {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(3, 4, 0);
        Vector3D b = new Vector3D(1, 2, 3);
        double r = 2.0;

        System.out.println("Algebra Vectorial");
        System.out.println("//a Suma: " + a.add(b));
        System.out.println("//b r*a: " + a.scalarMul(r));
        System.out.println("//c |a|: " + a.magnitude());
        System.out.println("//d Normal: " + a.normalize());
        System.out.println("//e a·b: " + a.dot(b));
        System.out.println("//f a×b: " + a.cross(b));

        System.out.println("Vector Tridimensional");
        System.out.println("//a " + AlgebraVectorial.perpendicular_a(a, b));
        System.out.println("//b " + AlgebraVectorial.perpendicular_b(a, b));
        System.out.println("//c " + AlgebraVectorial.perpendicular_c(a, b));
        System.out.println("//d " + AlgebraVectorial.perpendicular_d(a, b));
        System.out.println("//e " + AlgebraVectorial.paralelo_e(a, b));
        System.out.println("//f " + AlgebraVectorial.paralelo_f(a, b));
        System.out.println("//g " + AlgebraVectorial.proyeccion_g(a, b));
        System.out.println("//h " + AlgebraVectorial.componente_h(a, b));
    }
}
