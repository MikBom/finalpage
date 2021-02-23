
import java.util.Scanner;

public class Jakolasku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku1 = Integer.valueOf(lukija.nextLine());
        int luku2 = Integer.valueOf(lukija.nextLine());
        jakolasku(luku1, luku2);  
    }

    public static void jakolasku(int osoittaja, int nimittaja) { 
        double oikea = nimittaja;
        double tulos = (osoittaja / oikea);
        System.out.println(tulos);
    }
}