
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int maara = 0;
        while (true) {
            String rivi = lukija.nextLine();

            if (rivi.equals("loppu")) {
                break;
                
            }
            
            maara = maara + 1;
        }
        System.out.println(maara);
    }
}