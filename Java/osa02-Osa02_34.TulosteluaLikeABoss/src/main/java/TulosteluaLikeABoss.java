
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        int alku = 0;
        while (alku < maara) {
            System.out.print("*");
            alku++;
        }
        System.out.println("");
    }// tehtävän osa 1

    public static void tulostaTyhjaa(int maara) {
        int alku = 0;
        while (alku < maara) {
            System.out.print(" ");
            alku++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int i, j;

        for (i = 0; i < koko; i++) { //Outer loop work for rows
            for (j = koko - i; j > 1; j--) { //inner loop work for space
                tulostaTyhjaa(1); //prints space between two stars 
            }
            for (j = 0; j <= i; j++) { //inner loop for columns  
                if (j >= i) {
                    tulostaTahtia(j + 1); //prints star
                }
            }
        }
        // tehtävän osa 2
    }
    
    public static void jouluKuusi(int korkeus) {
        int i, j;
        for (i = 0; i < korkeus * 2; i += 2) {
            for (j = korkeus - i / 2 - 1; j > 0; j--) {
                tulostaTyhjaa(1);
            }
            for (int k = 0; k <= i; k++) {
                if (k >= i) {
                    tulostaTahtia(k + 1);
                }
            }

        }
        for (i = 1; i <= 2; i++) {
            tulostaTyhjaa(korkeus - 2);
            tulostaTahtia(3);

        }

    }

        


    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
