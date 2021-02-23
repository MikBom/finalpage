
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        int indeksi = 0;
        while (indeksi < taulukko.length) {
            int luku = taulukko[indeksi];
            indeksi = indeksi + 1;
                if (indeksi != taulukko.length) 
                    System.out.print(luku + ", ");
                if (indeksi == taulukko.length)
                    System.out.print(luku);
        }
    }
}
