
import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
           
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            esineet.add(new Esine(nimi));
        }
        System.out.println(esineet);
    }
}
