
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }
        return this.euroa + "." + nolla + this.senttia + "e";
    }

    public Raha plus(Raha lisattava) {
        int uusieuro = this.euroa + lisattava.eurot(); // luodaan uusi Raha-olio jolla on oikea arvo
        int uusisentti = this.senttia + lisattava.sentit();
        // palautetaan uusi Raha-olio
        return new Raha(uusieuro, uusisentti);
    }

    public Raha miinus(Raha vahentaja) {
        int uusieuro = this.euroa - vahentaja.eurot(); // luodaan uusi Raha-olio jolla on oikea arvo
        int uusisentti = this.senttia - vahentaja.sentit();
        // palautetaan uusi Raha-olio
        if (uusisentti < 0) {
            uusieuro = uusieuro - 1;
            uusisentti = uusisentti + 100;
        }
        if (uusieuro < 0) {
            return new Raha(0, 0);
        }
        return new Raha(uusieuro, uusisentti);
    }

    public boolean vahemman(Raha verrattava) {
        double alkuarvo = this.euroa + this.senttia / 100.0;
        double verrattavaArvo = verrattava.eurot() + verrattava.sentit() / 100.0;
        return alkuarvo < verrattavaArvo;
    }
}
