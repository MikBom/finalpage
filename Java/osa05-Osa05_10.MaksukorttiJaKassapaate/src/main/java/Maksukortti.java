
public class Maksukortti {

    private double saldo;

    public Maksukortti(double saldo) {
        this.saldo = saldo;
    }

    public double saldo() {
        return this.saldo;
    }

    public void lataaRahaa(double lisays) {
        this.saldo += lisays;
    }

    public boolean otaRahaa(double maara) {
        if (saldo >= maara) { // toteuta metodi siten että se ottaa kortilta rahaa vain jos saldo on vähintään maara
            this.saldo = saldo - maara;
            return true;
        } else {
            return false;
        }
    }
}
