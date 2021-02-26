
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Kuutio oSheaJackson = new Kuutio(7);
        
        System.out.println(oSheaJackson);

        System.out.println();

        Kuutio suola = new Kuutio(3);
        
        System.out.println(suola);
    }
}
