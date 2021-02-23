
public class Sekuntikello {

    private Viisari sadasosa;
    private Viisari sekunnit;

    public Sekuntikello() {

        this.sadasosa = new Viisari(100);
        this.sekunnit = new Viisari(60);
    }

    public void etene() {
        this.sadasosa.etene();

        if (this.sadasosa.arvo() == 0) {
            this.sekunnit.etene();

        }
    }

    public String toString() {
        return sekunnit + ":" + sadasosa;
    }
}
