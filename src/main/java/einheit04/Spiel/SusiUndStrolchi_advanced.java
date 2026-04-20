package einheit04.Spiel;

import java.util.concurrent.ThreadLocalRandom;

public class SusiUndStrolchi_advanced {
    static void main() {

        int punkteMax = 0;
        int punkeSusi = 0;


        while (punkteMax < 4 && punkeSusi < 4) {

            int positionMax = 0;
            int versucheMax = 0;
            int positionSusi = 0;
            int versucheSusi = 0;

            int ZIEL = 1000;

            boolean gameOn = true;

            // Max-Rennen
            while (gameOn) {
                positionMax += ThreadLocalRandom.current().nextInt(1, 6 + 1);
                versucheMax++;

                if (positionMax > ZIEL) {
                    gameOn = false;
                }
            }

            gameOn = true;

            while (gameOn) {
                positionSusi += ThreadLocalRandom.current().nextInt(1, 6 + 1);
                versucheSusi++;

                if (positionSusi > ZIEL) {
                    gameOn = false;
                }
            }

            System.out.println(versucheMax);
            System.out.println(versucheSusi);

            if (versucheMax == versucheSusi) {
                System.out.println("Unentschieden, kein Punkt für niemanden");
            } else if (versucheSusi > versucheMax) {
                System.out.println("Susi wins");
                punkeSusi++;
            } else {
                System.out.println("Max wins");
                punkteMax++;
            }
        }


        System.out.println(punkteMax > punkeSusi ? "Max wins" : "Susi wins");
        System.out.println("Endstand-Susi " + punkeSusi + " - Endstand-Max " + punkteMax);

    }


}
