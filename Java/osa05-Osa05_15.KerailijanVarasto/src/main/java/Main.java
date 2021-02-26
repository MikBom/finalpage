
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        ArrayList<Laskuri> lista = new ArrayList<>();

        Laskuri tuote;

        while (true) {
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String tunnus = lukija.nextLine();
            if (tunnus.isEmpty()) {
                break;
            }
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;

            }

            tuote = new Laskuri(tunnus, nimi);
            if (!lista.contains(tuote)) {
                lista.add(tuote);

            }
        }
        System.out.println("==Esineet==");
        for (Laskuri tuotteet : lista) {
            System.out.println(tuotteet);
        }
    }
}
