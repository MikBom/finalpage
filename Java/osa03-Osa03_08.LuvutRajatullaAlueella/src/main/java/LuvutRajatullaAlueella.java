
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        System.out.println("Mistä");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Mihin");
        int toka = Integer.valueOf(lukija.nextLine());
        
        while (eka <= toka) {
            int luku = luvut.get(eka);
            System.out.println(luku);
            eka = eka + 1;
        }

    }
}

