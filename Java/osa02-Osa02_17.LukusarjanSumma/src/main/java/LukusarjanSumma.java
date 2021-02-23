
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
       
        System.out.println("Mihin asti?");
        int luku = Integer.valueOf(lukija.nextLine());
        int tulos = 0;
        
        for (int i = 0; i < luku + 1; i++) {
            tulos = tulos + i;
 

            System.out.println(tulos);

 

        }
    }
}
