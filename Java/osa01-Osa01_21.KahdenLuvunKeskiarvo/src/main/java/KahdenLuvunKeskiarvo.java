
import java.util.Scanner;

public class KahdenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        double eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        double toka = Integer.valueOf(lukija.nextLine());// toteuta ohjelma tänne
           System.out.println("Syötettyjen lukujen keskiarvo on " + ((eka + toka)/2));// toteuta ohjelma tänne

    }
}
