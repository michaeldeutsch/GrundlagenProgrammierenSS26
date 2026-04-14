package einheit03.zeichen;

public class Abc {

    static void main() {

        int zeichenAlsWert = 99;
        char zeichen = (char) zeichenAlsWert;


        System.out.println(zeichen);

        int reverse = zeichen;
        System.out.println(reverse);

        for (char zeichenA = 'a'; zeichenA <= 'z'; zeichenA++) {
            System.out.print(zeichenA);
        }


    }
}
