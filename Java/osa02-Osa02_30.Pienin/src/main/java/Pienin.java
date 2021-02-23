
public class Pienin {

    public static int pienin(int luku1, int luku2) {
        int smaller = 0;
        int bigger = 0;
        if(luku1 < luku2){
            smaller = luku1;
               
        }else{
            smaller = luku2;
        }
        return smaller;
    }
    public static void main(String[] args) {
        int vastaus = pienin(2, 7);
        System.out.println("Pienin: " + vastaus);
    }
}
