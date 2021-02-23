/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikko.boman
 */
public class Maksukortti {

    private double saldo;
    
    public Maksukortti(double alkusaldo) {
        this.saldo = saldo + alkusaldo; // kirjoita koodia tähän
    }

    public String toString() {
        return "Kortilla on rahaa " + saldo + " euroa";// kirjoita koodia tähän
    }

    public void syoEdullisesti() {
        if (saldo < 2.60) {
            saldo = saldo;
        } else {
            saldo = saldo - 2.60;// kirjoita koodia tähän    
        }
    }
    
    

    public void syoMaukkaasti() {
        if (saldo < 4.60) {
            saldo = saldo;
        } else {
            saldo = saldo - 4.60;// kirjoita koodia tähän    
        }
    }

    public void lataaRahaa(double rahamaara) {
        if (rahamaara <= 0) {
            this.saldo = this.saldo;
        } else {
            this.saldo = saldo + rahamaara;// kirjoita koodia tähän
        }
        if (this.saldo > 150) {
            this.saldo = 150;
        } else {
            this.saldo = this.saldo;
        }

    }
}
