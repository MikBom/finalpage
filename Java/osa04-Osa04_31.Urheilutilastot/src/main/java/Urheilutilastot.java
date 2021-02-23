
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkue = lukija.nextLine();

        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            int ottelut = 0;
            int voitto = 0;
            int havio = 0;
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] palat = rivi.split(",");
                
                String koti = palat[0];
                String vieras = palat[1];
                
                int kotipisteet = Integer.valueOf(palat[2]);
                int vieraspisteet = Integer.valueOf(palat[3]);

                if(palat[0].equals(joukkue) || palat[1].equals(joukkue)) {
                    ottelut = ottelut + 1;
                 } // Otteluiden lasku
                
                if(palat[0].equals(joukkue) && kotipisteet > vieraspisteet) {
                    voitto = voitto + 1;
                }
                if(palat[1].equals(joukkue) && kotipisteet < vieraspisteet) {
                    voitto = voitto + 1;
                }
                if(palat[0].equals(joukkue) && kotipisteet < vieraspisteet) {
                    havio = havio + 1;
                }
                if(palat[1].equals(joukkue) && kotipisteet > vieraspisteet) {
                    havio = havio + 1;
                }

            }
            System.out.println("Otteluita: " + ottelut);
            System.out.println("Voittoja: " + voitto);
            System.out.println("Tappioita: " + havio);

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }
}
