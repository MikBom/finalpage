
public class Paaohjelma {

    public static void main(String[] args) {
        Raha a = new Raha(10, 0);
        Raha b = new Raha(5, 0);

        Raha c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // HUOM: tässä syntyy uusi Raha-olio, joka laitataan "a:n langan päähän"
//       vanha a:n langan päässä ollut 10 euroa häviää ja Javan roskien kerääjä korjaa sen pois

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e// tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
    }
}
