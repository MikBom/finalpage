
import java.util.ArrayList;
import java.util.Scanner;

public class PoistaViimeinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        poistaViimeinen(lista);
    }

    public static void poistaViimeinen(ArrayList<Integer> lista) {

        if (lista.size() == 0) {
            return;
        }

        lista.remove(lista.size() - 1);
    }
}
        