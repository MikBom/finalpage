
public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {

        
        int bigger = 0;
        if(luku1 >= luku2 && luku1 >= luku3){
            bigger = luku1;
        }
        if(luku2 >= luku1 && luku2 >= luku3){
            bigger = luku2;
        }
        if(luku3 >= luku1 && luku3 >= luku2){
            bigger = luku3;
        
        }
        return bigger;
    }
    public static void main(String[] args) {
        int vastaus = suurin(2, 7, 3);
        System.out.println("Suurin: " + vastaus);
    }
}
