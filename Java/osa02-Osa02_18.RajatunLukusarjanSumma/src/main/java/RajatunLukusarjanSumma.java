
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Ensimmäinen");        
        int eka = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Viimeinen");
        int vika = Integer.valueOf(lukija.nextLine());
        int tulos = 0;
        
        for (int i = eka; i < vika + 1; i++) {
            tulos = tulos + i;
 

            System.out.println(tulos);

 

        }
    }
}
    

