/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikko.boman
 */
public class Laskuri {
        private int arvo;
        private String tunnus;
        private String nimi;

    public Laskuri() {
        this(0);
    }
    public Laskuri(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
            
    }
    public Laskuri(int alkuarvo) {
        this.arvo = alkuarvo;
    }

    public void kasvata() {
        this.arvo = this.arvo + 1;
    }
    @Override
    public String toString() {
        return tunnus + ": " + nimi;
    }
    public boolean equals(Object verrattava) {
        Laskuri tuote = (Laskuri) verrattava;
        return this.tunnus.equals(tuote.tunnus);
    }

    public Laskuri kloonaa() {
        // luodaan uusi laskuriolio, joka saa alkuarvokseen kloonattavan laskurin arvon
        Laskuri klooni = new Laskuri(this.arvo);

        // palautetaan klooni kutsujalle
        return klooni;
    }
}

