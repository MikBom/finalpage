
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.println("Sivuja: ");
            int sivu = Integer.valueOf(lukija.nextLine());
            System.out.println("Julkaisuvuosi: ");
            int vuosi = Integer.valueOf(lukija.nextLine());

            kirjat.add(new Kirja(nimi, sivu, vuosi));
        }
        System.out.println("Mitä tulostetaan: ");
        String komento = lukija.nextLine();

        if (komento.equals("nimi")) {
            for (int i = 0; i < kirjat.size(); i++) {
                System.out.println(kirjat.get(i).getNimi());
            }
        }

        if (komento.equals("kaikki")) {
            for (int i = 0; i < kirjat.size(); i++) {
                System.out.println(kirjat);
            }
        }
    }
}

