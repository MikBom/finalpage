
import java.util.ArrayList;
import java.util.Scanner;

public class Summa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
   
        summa(lista);
    }

    public static int summa(ArrayList<Integer> lista) {

        int summa = 0;
        for (int luku : lista) {
            summa = summa + luku;
        }

        return summa;
    }
}
        
    

