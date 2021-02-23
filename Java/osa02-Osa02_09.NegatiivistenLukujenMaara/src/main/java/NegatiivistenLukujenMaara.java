
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
                // Tehtävänä negojen lukumäärän säilöminen

        int ykkosia = 0;

        // Tehtävänä lukujen lukemisen toistaminen

        while (true) {

            System.out.println("Syötä luku");

            // Tehtävänä yksittäisen luvun lukeminen

            int luku = Integer.valueOf(lukija.nextLine());

 

            // Tehtävänä toistolauseesta poistuminen kun

            // käyttäjä syöttää luvun nolla

            if (luku == 0) {

                break;

            }

 

            // Tehtävänä lukumäärän kasvattaminen

            // yhdellä kun käyttäjä syöttää luvun joka ei oo nolla

            if (luku < 0) {

                ykkosia = ykkosia + 1;

            }

        }

 

        // Tehtävänä havainnoitujen lukujen lukumäärän tulostaminen

        System.out.println("Negatiivisia lukuja yhteensä " + ykkosia);

    }

}
