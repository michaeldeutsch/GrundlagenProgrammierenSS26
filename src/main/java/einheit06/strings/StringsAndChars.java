package einheit06.strings;

import java.util.concurrent.ThreadLocalRandom;

public class StringsAndChars {
    static void main() {

        char zeichen = 'Z'; // 97 - 122 -> a - z, 65-90 -> A - Z

        int wert = ThreadLocalRandom.current().nextInt(65, 122);
        char versuch2 = (char) ThreadLocalRandom.current().nextInt('A', 'z');


        System.out.println((char) wert);
        System.out.println((int) zeichen);
        System.out.println(versuch2);


    }
}
