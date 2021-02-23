
import java.util.ArrayList;
import java.util.Scanner;

public class TulostaRajatut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int alaraja = Integer.valueOf(lukija.nextLine());
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        tulostaRajatutLuvut(lista, alaraja, ylaraja);
    }

    public static void tulostaRajatutLuvut(ArrayList<Integer> lista, int alaraja, int ylaraja) {
        for (int luku : lista) {
            if (luku >= alaraja && luku <= ylaraja) {
                System.out.println(luku);
            }
        }
    }
}
