
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == 9999) {
                break;
            }
            lista.add(luettu);
        }

        int pienin = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            int luku = lista.get(i);
            if (pienin > luku) {
                pienin = luku;
            }
            System.out.println("Pienin luku on " + pienin);
            System.out.println("Luku on indeksissä " + i);

        }

    }
}

