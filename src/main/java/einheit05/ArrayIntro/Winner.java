package einheit05.ArrayIntro;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Winner {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        int spielerAnzahL = 5;

        int[] punktePerSpieler = new int[spielerAnzahL];
        String[] namen = new String[spielerAnzahL];

        // Namen einlesen
        for (int name = 0; name < spielerAnzahL; name++) {
            System.out.println("Bitte Spielername eingeben");
            namen[name] = scanner.nextLine();
        }

        // Punktevergabe
        for (int spieler = 0; spieler < spielerAnzahL; spieler++) {
            punktePerSpieler[spieler] = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        }

        // Sieger ermitteln by Punkte
        int maxScore = -1;
        int maxScoreIndex = -1;


        for (int spieler = 0; spieler < spielerAnzahL; spieler++) {
            if (punktePerSpieler[spieler] > maxScore) {
                maxScore = punktePerSpieler[spieler];
                maxScoreIndex = spieler;
            }
        }

        System.out.println("Gewinner ist  " + namen[maxScoreIndex] + " und hat gewonnen mit Punkte: " + punktePerSpieler[maxScoreIndex]);

        //System.out.println(Arrays.toString(namen));


    }
}
