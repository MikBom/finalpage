
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto tilasto1 = new Lukutilasto();
        Lukutilasto tilasto2 = new Lukutilasto();

        System.out.println("Anna lukuja:");
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            if (luku != -1) {
                tilasto.lisaaLuku(luku);
            }
            if (luku % 2 == 0) {
                tilasto1.lisaaLuku(luku);
            } else {
                tilasto2.lisaaLuku(luku);
            }

        }

        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + tilasto1.summa());
        System.out.println("Parittomien summa: " + tilasto2.summa());

    }
}
