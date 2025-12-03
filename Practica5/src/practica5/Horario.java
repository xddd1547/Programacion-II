/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Liz
 */
public class Horario {
    private String DiasAp, HoraAp, HoraCie;

    public Horario(String DiasAp, String HoraAp, String HoraCie) {
        this.DiasAp = DiasAp;
        this.HoraAp = HoraAp;
        this.HoraCie = HoraCie;
    }
    public void mostrarHorario() {
            System.out.println("Horario: " + DiasAp + " " + HoraAp + " - " + HoraCie);
        }
}
