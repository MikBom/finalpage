
public class VahenevaLaskuri {

    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon
    private int uusi;
    
    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        arvo = arvo - 1; // kirjoita tänne metodin toteutus
        if (arvo <= 0)
             arvo = 0;// laskurin arvon on siis tarkoitus vähentyä yhdellä
    }

    public void nollaa () {
        this.arvo = 0;
  }
}
