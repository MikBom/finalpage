/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikko.boman
 */
public class Mittari {

    private int mitta;

    public void lisaa() {
        mitta = mitta + 1;
        if (mitta >= 5) {
            mitta = 5;
        }
    }

    public void vahenna() {
        mitta = mitta - 1;
        if (mitta <= 0) {
            mitta = 0;
        }
    }

    public int mitta() {
        return mitta;
    }

    public boolean taynna() {
        if (mitta == 5) {
            return true;
        } else {
            return false;
        }
    }

}
