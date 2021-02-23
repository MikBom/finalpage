/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikko.boman
 */
public class Kirja {

    private String nimi;
    private int sivu;
    private int vuosi;

    public Kirja(String nimi, int sivu, int vuosi) {
        this.nimi = nimi;
        this.sivu = sivu;
        this.vuosi = vuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getVuosi() {
        return vuosi;
    }


    public String toString() {
        return nimi + ", " + sivu + " sivua, " + vuosi;
    }
}
