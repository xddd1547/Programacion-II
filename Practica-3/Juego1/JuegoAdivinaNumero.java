/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3.Juego1;

/**
 *
 * @author Liz
 */
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega() {
        reiniciaPartida();
        Random random = new Random();
        numeroAAdivinar = random.nextInt(11);
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina un numero entre 0 y 10:");

        while (true) {
            int intento = sc.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El numero a adivinar es MAYOR.");
                    } else {
                        System.out.println("El numero a adivinar es MENOR.");
                    }
                    System.out.println("Intenta de nuevo:");
                } else {
                    System.out.println("Perdiste! El numero era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}

