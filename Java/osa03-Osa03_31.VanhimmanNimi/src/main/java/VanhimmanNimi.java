
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int suurin = 0;
        int luku = 0;
        String nimi = "";
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(",");

            luku = Integer.valueOf(palat[1]);
            if (suurin < luku) {
                suurin = luku;
                nimi = palat[0];
            }

        }
        System.out.println("Vanhimman nimi: " + nimi);
    }

}

    
