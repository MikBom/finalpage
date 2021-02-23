/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikko.boman
 */
public class Kertoja {
    
    private int arvo;

    
    public Kertoja(int luku) {
    this.arvo = luku;
    }
    public int kerro(int luku) {
        return arvo * luku;
    }
}
