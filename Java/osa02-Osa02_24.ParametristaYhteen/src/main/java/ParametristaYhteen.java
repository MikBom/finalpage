
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());

        tulostaLuvustaYhteen(luku);

    }

    public static void tulostaLuvustaYhteen(int testi) {

 

        int i = 0;

        while (testi > i) {

            System.out.println(testi);

            testi--;

        }

    }

}
