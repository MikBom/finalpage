
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi
                && this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

    public void etene() {
        paiva = paiva + 1;
        if (paiva > 30) {
            kuukausi = kuukausi + 1;
            this.paiva = this.paiva - 30;
            {
                if (kuukausi > 12) {
                    vuosi = vuosi + 1;
                    this.kuukausi = 1;
                }
            }
        }
    }

    public void etene(int montakoPaivaa) {
        this.paiva = this.paiva + montakoPaivaa;
        if (paiva > 30) {
            kuukausi = kuukausi + 1;
            this.paiva = this.paiva - 30;
            {
                if (kuukausi > 12) {
                    vuosi = vuosi + 1;
                    this.kuukausi = 1;
                }
            }
        }
    }

    public Paivays paivienPaasta(int paivia) {
        Paivays uusiPaivays = new Paivays(paivia, kuukausi, vuosi);
        
        uusiPaivays.paiva = this.paiva + paivia;
        if (uusiPaivays.paiva > 30) {
            uusiPaivays.kuukausi = kuukausi + 1;
            uusiPaivays.paiva = uusiPaivays.paiva - 30;
            {
                if (uusiPaivays.kuukausi > 12) {
                    uusiPaivays.vuosi = vuosi + 1;
                    uusiPaivays.kuukausi = 1;
                }
            }

        }
        return uusiPaivays;
    }
}
