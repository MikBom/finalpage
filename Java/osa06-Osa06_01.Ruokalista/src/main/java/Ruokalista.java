
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    
    public void lisaaAteria(String ateria) {
        if (!this.ateriat.contains(ateria)) {
            this.ateriat.add(ateria);
        } //lisää aterian ruokalistalle. Mikäli ateria on jo listalla, sitä ei lisätä uudestaan.
    }

    public void tulostaAteriat() {  //tulostaa ateriat.
        for (String ateria : ateriat) {
            System.out.println(ateria);
        }
    }
    public void tyhjennaRuokalista() { //tyhjentää ruokalistan.
    this.ateriat.clear();
    }// toteuta tänne tarvittavat metodit
}
