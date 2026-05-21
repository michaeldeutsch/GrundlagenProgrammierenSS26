package einheit06.strings;

import java.util.concurrent.ThreadLocalRandom;

public class WortZufall {

    static void main() {


        String wort = "";

        for (int i = 0; i < 10; i++) {
            wort = wort + (char) ThreadLocalRandom.current().nextInt('A', 'z');
        }

        wort = "Test123!";
        System.out.println(wort);

        System.out.println(wort.length());

        System.out.println(wort.charAt(0));
        System.out.println(wort.charAt(wort.length() - 1));

        for (int i = 0; i < wort.length(); i++) {
            //System.out.println(wort.charAt(i));
            char aktuellesZeichen = wort.charAt(i);

            if (Character.isLetter(aktuellesZeichen)) {
                // System.out.println(aktuellesZeichen + " ist ein Buchstabe");
                if (Character.isLowerCase(aktuellesZeichen)) {
                    System.out.println(aktuellesZeichen + " ist ein Kleinbuchstabe");
                } else {
                    System.out.println(aktuellesZeichen + " ist ein Großtbuchstabe");
                }

            } else if (Character.isDigit(aktuellesZeichen)) {
                System.out.println(aktuellesZeichen + " ist eine Zahl ");
            } else {
                System.out.println(aktuellesZeichen + " ist ein Sonderzeichen");
            }

        }


    }
}
