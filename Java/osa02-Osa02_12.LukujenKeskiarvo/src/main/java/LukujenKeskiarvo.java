
import java.util.Scanner;

public class LukujenKeskiarvo {

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
            if (luku != 0) {
                ykkosia = ykkosia + luku;
                kakkosia = kakkosia + 1;
            }
        }
        System.out.println("Lukujen keskiarvo " + (ykkosia / kakkosia));
    }
}
