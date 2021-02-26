
public class Kasvatuslaitos {

    private int paino;

    public Kasvatuslaitos() {
        paino = 0;
    }

    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }

    public int punnitse(Henkilo henkilo) {
        paino = paino + 1;// palautetaan parametrina annetun henkilön paino
        return henkilo.getPaino();
    }
    public int punnitukset() {
        return paino;
    }

}
