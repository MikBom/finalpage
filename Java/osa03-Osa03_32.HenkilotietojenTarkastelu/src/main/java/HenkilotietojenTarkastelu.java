
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        int lukumaara = 0;
        int pisin = 0;
        String nimi = "";
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(",");
            summa = summa + Integer.valueOf(palat[1]);
            lukumaara = lukumaara + 1;
            
            for (int i = 0; i < palat.length; i++){
            if (palat[i].length() > pisin){
                pisin = palat[i].length();
                nimi = palat[0];
            }
          }
        }
        System.out.println("Pisin nimi:" + nimi);
        System.out.println("Syntymävuosien keskiarvo:" + (1.0 * summa / lukumaara));
    }
}


