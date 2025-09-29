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
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    // Método validación general
    public boolean validaNumero(int n) {
        return n >= 0 && n <= 10;
    }

    public void juega() {
        reiniciaPartida();
        Random random = new Random();
        numeroAAdivinar = random.nextInt(11);
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina un número entre 0 y 10:");

        while (true) {
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Intenta de nuevo (0 a 10).");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es MAYOR.");
                    } else {
                        System.out.println("El número a adivinar es MENOR.");
                    }
                    System.out.println("Intenta de nuevo:");
                } else {
                    System.out.println("¡Perdiste! El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}
