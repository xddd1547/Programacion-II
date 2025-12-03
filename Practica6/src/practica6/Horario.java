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

public class Horario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String DiasAp, HoraAp, HoraCie;

    public Horario(String DiasAp, String HoraAp, String HoraCie) {
        this.DiasAp = DiasAp;
        this.HoraAp = HoraAp;
        this.HoraCie = HoraCie;
    }

    public void mostrarHorario() {
        System.out.println("Horario: " + DiasAp + " " + HoraAp + "-" + HoraCie);
    }
}