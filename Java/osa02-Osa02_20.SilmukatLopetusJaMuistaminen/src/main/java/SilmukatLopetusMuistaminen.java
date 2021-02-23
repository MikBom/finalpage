
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Syötä luvut:");
        int summa = 0;
        
        int lukuja = 0;
        int parillinen = 0;
        int pariton = 0;
        double kakkosia = 0;

        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());

            if (luettu == -1) {
                
                break;                   
            }

            if (luettu != -1) {
                summa = summa + luettu;
                lukuja ++;
                kakkosia = kakkosia + 1;
                
                if (luettu % 2 == 0 && luettu != -1) {                    
                    parillinen++;
                } else {
                    pariton++; 
                }
                continue;
            }
         
        }
        
        double keskiarvo = (summa / kakkosia);
        
        System.out.println("Kiitos ja näkemiin");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukuja);
        System.out.println("Keskiarvo: " + (keskiarvo));
        System.out.println("Parillisia: " + parillinen);
        System.out.println("Parittomia: " + pariton);

    }
}
