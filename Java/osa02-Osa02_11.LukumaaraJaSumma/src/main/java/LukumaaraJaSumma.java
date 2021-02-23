
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ykkosia = 0;
        int kakkosia = 0;
 

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

            if (luku != 0) {

                ykkosia = ykkosia + luku;

            }
            if (luku != 0) {

                kakkosia = kakkosia + 1;

            }
            

        }

 

        // Tehtävänä havainnoitujen lukujen lukumäärän tulostaminen
        System.out.println("Lukuja yhteensä " + kakkosia);
        System.out.println("Lukujen summa " + ykkosia);

    }

}

