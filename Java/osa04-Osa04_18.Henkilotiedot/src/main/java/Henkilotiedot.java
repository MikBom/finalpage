
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Etunimi: ");
            String etunimi = lukija.nextLine();
            if (etunimi.isEmpty()) {
                break;
            }
            System.out.println("Sukunimi: ");
            String sukunimi = lukija.nextLine();
            System.out.println("Henkilötunnus: ");
            String sotu = lukija.nextLine();
            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi, sotu));

        }
        for (int i = 0; i < henkilotiedot.size(); i++) {
            System.out.println(henkilotiedot.get(i).getEtunimi() + " "
                    + henkilotiedot.get(i).getSukunimi());
        }
    }
}
