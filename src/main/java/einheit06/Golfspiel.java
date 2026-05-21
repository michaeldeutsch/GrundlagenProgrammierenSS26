package einheit06;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Golfspiel {

    static void main() {
        Scanner scan = new Scanner(System.in);

        int anzahlSpieler = 10;
        int anzahlLoecher = 18;

        int[][] golfspiel = new int[anzahlSpieler][anzahlLoecher];
        String[] namen = new String[anzahlSpieler];
        int[] wahrscheinlichkeit = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        // Einlesen - Anfang
        for (int i = 0; i < anzahlSpieler; i++) {
            // String name = scan.nextLine();
            namen[i] = "Spieler " + i;
        }

        //  System.out.println(Arrays.toString(namen));
        // Einlesen - Ende

        // Spiel beginnt
        //  < -  <-
        for (int spieler = 0; spieler < anzahlSpieler; spieler++) {
            for (int loch = 0; loch < anzahlLoecher; loch++) {
                // golfspiel[spieler][loch] = ThreadLocalRandom.current().nextInt(1, 4 + 1); // gleichvereilt
                int index = ThreadLocalRandom.current().nextInt(0, 9 + 1); // Häufig lt. Angabe
                golfspiel[spieler][loch] = wahrscheinlichkeit[index]; // {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

            }
        }

        print2DArray(anzahlSpieler, anzahlLoecher, golfspiel);


        // Spiel - Ende

    }


    public static void print2DArray(int anzahlSpieler, int anzahlLoecher, int[][] golfspiel) {
        // Ausgabe - Anfang
        //  System.out.println(Arrays.deepToString(golfspiel));
        for (int spieler = 0; spieler < anzahlSpieler; spieler++) {
            for (int loch = 0; loch < anzahlLoecher; loch++) {
                System.out.print(golfspiel[spieler][loch] + "\t");
            }
            System.out.println();
        }
        // Ausgabe - Ende
    }
}
