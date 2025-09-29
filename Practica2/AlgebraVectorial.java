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
public class AlgebraVectorial {
    private static final double EPS = 1e-8;

    //a
    public static boolean perpendicular_a(Vector3D a, Vector3D b) {
        return Math.abs(a.add(b).magnitude() - a.subtract(b).magnitude()) < EPS;
    }

    //b
    public static boolean perpendicular_b(Vector3D a, Vector3D b) {
        return Math.abs(a.subtract(b).magnitude() - b.subtract(a).magnitude()) < EPS;
    }

    //c
    public static boolean perpendicular_c(Vector3D a, Vector3D b) {
        return Math.abs(a.dot(b)) < EPS;
    }

    //d
    public static boolean perpendicular_d(Vector3D a, Vector3D b) {
        double left = Math.pow(a.add(b).magnitude(), 2);
        double right = Math.pow(a.magnitude(), 2) + Math.pow(b.magnitude(), 2);
        return Math.abs(left - right) < EPS;
    }

    //e
    public static boolean paralelo_e(Vector3D a, Vector3D b) {
        if (b.magnitude() < EPS) return a.magnitude() < EPS;
        double r = a.magnitude() / b.magnitude();
        Vector3D rb = b.scalarMul(r);
        return a.equals(rb);
    }

    //f
    public static boolean paralelo_f(Vector3D a, Vector3D b) {
        return a.cross(b).magnitude() < EPS;
    }

    //g
    public static Vector3D proyeccion_g(Vector3D a, Vector3D b) {
        double denom = Math.pow(b.magnitude(), 2);
        if (denom < EPS) return new Vector3D();
        double escalar = a.dot(b) / denom;
        return b.scalarMul(escalar);
    }

    //h
    public static double componente_h(Vector3D a, Vector3D b) {
        double magB = b.magnitude();
        if (magB < EPS) return 0;
        return a.dot(b) / magB;
    }
}
