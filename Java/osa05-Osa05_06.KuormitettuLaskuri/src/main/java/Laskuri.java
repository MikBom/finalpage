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

    private int alkuarvo;

    public Laskuri(int alkuarvo) {
        this.alkuarvo = alkuarvo;
    }
    //asettaa laskurin alkuarvoksi parametrin alkuarvo arvon.

    public Laskuri() { //laskurin alkuarvoksi tulee 0.
        this.alkuarvo = 0;
    }

    public int arvo() {
        return alkuarvo;
    } //palauttaa laskurin tämänhetkisen arvon

    public void lisaa() {
        alkuarvo = alkuarvo + 1; //lisää laskurin arvoa yhdellä
    }

    public void vahenna() {// vähentää laskurin arvoa yhdellä
        alkuarvo = alkuarvo - 1;
    }

    public void lisaa(int lisays) { // lisää laskurin arvoa parametrina annetun luvun verran. Jos parametrin arvo on negatiivinen, ei laskurin arvo muutu.
        if (lisays >= 0) {
            alkuarvo = alkuarvo + lisays;
        } else {
            alkuarvo = alkuarvo;
        }
    }

    public void vahenna(int vahennys) { // vähentää laskurin arvoa parametrina annetun luvun verran. Jos parametrin arvo on negatiivinen, ei laskurin arvo muutu.
        if (vahennys >= 0) {
            alkuarvo = alkuarvo - vahennys;
        } else {
            alkuarvo = alkuarvo;
        }
    }
}