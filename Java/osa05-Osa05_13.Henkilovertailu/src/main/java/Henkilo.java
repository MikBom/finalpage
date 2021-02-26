
import java.util.Objects;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }

    public boolean equals(Object verrattava) {
        Henkilo verrattavaHenkilo = (Henkilo) verrattava;

        // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
        if (this.nimi == verrattavaHenkilo.nimi
                && this.syntymaPaiva.equals(verrattavaHenkilo.syntymaPaiva)
                && this.pituus == verrattavaHenkilo.pituus
                && this.paino == verrattavaHenkilo.paino) {
            return true;
        }
        // muulloin oliot eivät ole samat
        return false;
    }// toteuta tänne equals-metodi, jolla tarkastellaan olioiden samuutta
}
