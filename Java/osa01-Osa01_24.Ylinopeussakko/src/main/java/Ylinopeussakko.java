
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.valueOf(lukija.nextLine());
        if (eka > 120) {
        System.out.println("Ylinopeussakko!");
}
    }
}
