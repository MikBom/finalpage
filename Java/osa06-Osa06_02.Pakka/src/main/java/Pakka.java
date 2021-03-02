
import java.util.ArrayList;

public class Pakka {

    private final ArrayList<String> rivit = new ArrayList<>();

    public boolean onTyhja() {//- palauttaa boolean-tyyppisen arvon (true tai false), joka kertoo onko pakka tyhjä.
        return this.rivit.isEmpty();
    }

    public void lisaa(String arvo) { //- lisää pakan päälle parametrina annetun arvon.
        rivit.add(arvo);
    }

    public ArrayList<String> arvot() { //- palauttaa pakan sisältämän arvot listana.
        return rivit;
    }

    public String ota() {
        final String viimeisin = rivit.get(rivit.size() - 1);
        rivit.remove(viimeisin);
        return viimeisin;
    }
}
