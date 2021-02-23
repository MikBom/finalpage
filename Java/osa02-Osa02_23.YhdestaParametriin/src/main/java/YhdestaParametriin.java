
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = Integer.valueOf(lukija.nextLine());
        tulostaLukuunAsti(luku);
    }
    public static void tulostaLukuunAsti(int testi) {

        int i = 1;
        while (i <= testi) {
            System.out.println(i);
            i++;
        }
    }
}