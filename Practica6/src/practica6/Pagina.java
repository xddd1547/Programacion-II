/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author Liz
 */
import java.io.Serializable;

public class Pagina implements Serializable {
    private static final long serialVersionUID = 1L;

    private int numPag;
    private String contPag;

    public Pagina(int numPag, String contPag) {
        this.numPag = numPag;
        this.contPag = contPag;
    }

    public void mostrarPagina() {
        System.out.println("pagina " + numPag + ": " + contPag);
    }
}