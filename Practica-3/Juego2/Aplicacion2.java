/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3.Juego2;

/**
 *
 * @author Liz
 */
public class Aplicacion2 {
    public static void main(String[] args) {
        JuegoAdivinaNumero j1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar j2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar j3 = new JuegoAdivinaImpar(3);

        System.out.println("--- Juego Normal ---");
        j1.juega();

        System.out.println("--- Juego Par ---");
        j2.juega();

        System.out.println("--- Juego Impar ---");
        j3.juega();
    }
}
