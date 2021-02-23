
import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();

        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());

        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());

        int lukumaara = 0;

        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                int luku = Integer.parseInt(rivi);
                if (luku >= alaraja && luku <= ylaraja) {
                    
                    lukumaara = lukumaara + 1;
                }
                
                
            }System.out.println("Lukuja: " + lukumaara);
            

        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");

        }
    }
}
