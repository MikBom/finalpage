
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mihin asti?");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int alku = Integer.valueOf(lukija.nextLine());

        for (int i = alku; i < luku + 1; i++) {

            System.out.println(i);

        }

    }

}

