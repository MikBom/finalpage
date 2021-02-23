
public class Lukutilasto {

    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {

    }

    public void lisaaLuku(int luku) {
        this.lukujenMaara = lukujenMaara + 1;
        this.summa = summa + luku;
    }
    
    public int haeLukujenMaara() {
        return lukujenMaara;// kirjoita koodia tähän
    }

    public int summa() {
        return this.summa;// kirjoita koodia tähän
    }
    
    public double keskiarvo() {
        if (this.lukujenMaara == 0) {
            return 0;
        } else {
            return (1.0 * this.summa / this.lukujenMaara);// kirjoita koodia tähän
        }
    }
}
