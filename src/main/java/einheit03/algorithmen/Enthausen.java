package einheit03.algorithmen;

/**
 * Ein komplexeres Verteilungsproblem für drei Personen unter mathematischen Randbedingungen.
 */
public class Enthausen {
    static void main() {
        int vermoegen = 500;

        // Erbekonstellation: Tick, Trick und Tack teilen sich ein Vermögen.
        // Bedingungen:
        // - Trick bekommt mehr als Tick und Tack zusammen.
        // - Tack bekommt mindestens 77 Münzen.
        // - Tick bekommt eine gerade Anzahl von Münzen.
        // - Das gesamte Vermögen muss verteilt werden.
        for (int tick = 2; tick < vermoegen; tick += 2) {
            for (int tack = 77; tack < vermoegen; tack++) {
                int trick = vermoegen - tick - tack;

                if (trick > (tick + tack)) {
                    System.out.println("Lösung gefunden:");
                    System.out.println("Tick: " + tick);
                    System.out.println("Trick: " + trick);
                    System.out.println("Tack: " + tack);
                    System.out.println("-----------------");
                }
            }
        }
    }
}
