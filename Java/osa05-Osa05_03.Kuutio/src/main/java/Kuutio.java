/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikko.boman
 */
public class Kuutio {

    private int sarmanpituus;
    private int tilavuus;

    public Kuutio(int sarmanPituus) {
        this.sarmanpituus = sarmanPituus;
    }

    public int tilavuus() {
        // joka laskee ja palauttaa kuution tilavuuden. Kuution tilavuus lasketaan kaavalla sarmanPituus * sarmanPituus * sarmanPituus.
        return sarmanpituus * sarmanpituus * sarmanpituus;
    }

    public String toString() {
        return "Kuution särmän pituus on " + sarmanpituus + ", tilavuus on " + tilavuus();
    }

}
