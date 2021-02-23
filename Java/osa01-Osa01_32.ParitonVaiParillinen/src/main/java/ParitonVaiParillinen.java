
import java.util.Scanner;

public class ParitonVaiParillinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.valueOf(lukija.nextLine());
        if (eka % 2 == 0) {
            System.out.println("Luku " + eka + " on parillinen.");
        } else {
            System.out.println("Luku " + eka + " on pariton.");
        }
    }
}
