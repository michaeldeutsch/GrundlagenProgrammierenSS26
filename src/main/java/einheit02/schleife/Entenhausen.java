package einheit02.schleife;

/**
 * Löst ein Verteilungsproblem für drei Personen (Trick, Track, Tick) unter bestimmten Bedingungen.
 */
public class Entenhausen {
    static void main() {
        int gesamtGeld = 500;

        // Bedingungen: Jeder bekommt etwas (>0), Track bekommt eine gerade Summe,
        // Tick bekommt mehr als Trick, und keiner bekommt mehr als die Hälfte des Gesamtgeldes.
        for (int trick = 1; trick < gesamtGeld / 2; trick++) {
            for (int track = 2; track < gesamtGeld / 2; track += 2) {
                int tick = gesamtGeld - trick - track;

                if (tick > 0 && tick < gesamtGeld / 2 && tick > trick) {
                    System.out.println("Trick: " + trick + ", Track: " + track + ", Tick: " + tick);
                }
            }
        }
    }
}
