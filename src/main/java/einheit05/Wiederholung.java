package einheit05;

import java.util.concurrent.ThreadLocalRandom;

public class Wiederholung {

    static void main() {

        int position = 0;
        int ziel = 100;
        int wochentag = 0;
        int anzahl = 0;


        do {
            anzahl++;
            position += ThreadLocalRandom.current().nextInt(1, 6 + 1);
            wochentag++;

            if (wochentag == 7) wochentag = 0;

        } while (position <= ziel);

        System.out.println("Hasi hat nach " + anzahl + " Sprüngen " + position + " geschafft");
        System.out.println("Das ist ein der " + wochentag + ". Tag der Woche");
    }
}
