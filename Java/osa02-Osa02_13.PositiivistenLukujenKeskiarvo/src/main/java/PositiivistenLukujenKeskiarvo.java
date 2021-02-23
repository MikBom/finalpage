
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ykkosia = 0;
        double kakkosia = 0;
        while (true) {
            System.out.println("Syötä luku");

            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            if (luku > 0) {
                ykkosia = ykkosia + luku;
            }
            if (luku > 0) {
                kakkosia = kakkosia + 1;
            } 
        }
        if (ykkosia > 0) {

            System.out.println("Lukujen keskiarvo on " + (ykkosia / kakkosia));

        } else {

            System.out.println("keskiarvon laskeminen ei ole mahdollista");

        }
    }
}    

