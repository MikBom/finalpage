
public class Kirja {

    private String nimi;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public boolean equals(Object verrattava) {
        Kirja verrattavaKirja = (Kirja) verrattava;
        return this.nimi.equals(((Kirja) verrattava).nimi) && this.julkaisuvuosi == verrattavaKirja.julkaisuvuosi;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

}
