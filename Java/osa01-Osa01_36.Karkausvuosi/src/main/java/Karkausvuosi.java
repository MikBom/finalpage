
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna vuosi: ");
        int eka = Integer.valueOf(lukija.nextLine());
        if (eka % 4 != 0) {
            System.out.println("Vuosi ei ole karkausvuosi.");
        } else if (eka % 400 == 0) {
            System.out.println("Vuosi on karkausvuosi.");
        } else if (eka % 100 == 0) {
            System.out.println("Vuosi ei ole karkausvuosi.");
        } else {
            System.out.println("Vuosi on karkausvuosi.");
        }
    }
}