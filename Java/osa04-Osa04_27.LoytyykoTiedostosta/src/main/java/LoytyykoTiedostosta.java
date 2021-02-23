
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        ArrayList<String> lista = new ArrayList<>();
        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                lista.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        if (lista.contains(etsittava)) {
            System.out.println("Löytyi!");
        } else {
            System.out.println("Ei löytynyt.");
        }
    }
}

