
public class Kassapaate {

    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        rahaa = 1000; // kassassa on aluksi 1000 euroa rahaa
    }

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        if (maksu < 2.50) {
            return maksu;
        } else {
            this.edulliset = edulliset + 1;
            this.rahaa = rahaa + 2.50;
            return maksu - 2.50;// päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        }        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan

    }

    public double syoMaukkaasti(double maksu) {
        // maukas lounas maksaa 4.30 euroa.
        if (maksu < 4.30) {// päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
            return maksu;// jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        } else {
            this.maukkaat = maukkaat + 1;
            this.rahaa = rahaa + 4.30;
            return maksu - 4.30;
        }

    }

    public boolean syoEdullisesti(Maksukortti kortti) {

        if (kortti.saldo() < 2.50) {
            return false;
        } else {
            this.edulliset = edulliset + 1;
            kortti.otaRahaa(2.50);
            return true;// edullinen lounas maksaa 2.50 euroa.
        }
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {

        if (kortti.saldo() < 4.30) {
            return false;
        } else {
            this.maukkaat = maukkaat + 1;
            kortti.otaRahaa(4.30);
            return true;
        }
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa >= 0) {
            kortti.lataaRahaa(summa);
            this.rahaa = rahaa + summa;// ...

        }
    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty "
                + edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
