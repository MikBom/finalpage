
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku:");        
        int eka = Integer.valueOf(lukija.nextLine());
       
        int tulos = 1;
        
        for (int i = 1; i < eka + 1; i++) {
            tulos = tulos * i;
 

            System.out.println("Kertoma on " + tulos);

 

        }
    }
}
    
