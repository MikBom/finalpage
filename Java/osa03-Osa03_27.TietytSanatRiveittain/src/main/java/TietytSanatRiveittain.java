
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(" ");
            for (String sana : palat) {
                if (sana.contains("av")) {
                    System.out.println(sana);
                }
            }
        }
    }
}

