/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikko.boman
 */
public class Harjoitusapuri {

    private int Ika;
    private int lepoSyke;


    public Harjoitusapuri(int ika, int leposyke) {

        this.Ika = ika;
        this.lepoSyke = leposyke;
    }

    public double tavoitesyke(double prosenttiaMaksimista) {
        return ((206.3 - (0.711 * Ika)) - lepoSyke) * prosenttiaMaksimista + lepoSyke;
    }
}
