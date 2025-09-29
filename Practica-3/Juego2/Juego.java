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
public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("Iniciando nueva partida...");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo record! Record actual: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan " + numeroDeVidas + " vidas.");
        return numeroDeVidas > 0;
    }
}
