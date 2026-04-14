package einheit03.algorithmen;

public class Enthausen {

    static void main() {

        int vermoegen = 500;
        // Trick, Tick, Tack
        // Erbekonstellation, alle Möglichkeinten, Anzahl der Möglichkeiten
        // alles muss vergeben werden
        // Jede Kombination hat eine Varianten-ID:
        // wie viele Kombis es gab
        // Trick bekommt mehr als Tack und Tick
        // Tack bekommt einen Mindestanteil von 77
        // Tick bekommt eine gerade Anzahl von Münzen

        for (int tick = 1; tick < vermoegen; tick++) {
            for (int trick = 1; trick < vermoegen; trick++) {
                for (int tack = 1; tack < vermoegen; tack++) {
                    // Grundgerüst, 3 Schleifen, mit Anfangs- und Endwert

                    boolean hasMachted = (tack + tick + trick) == vermoegen;
                    boolean trickBiggerAs = trick > (tack + tick);
                    boolean tackLimit = tack >= 77;
                    boolean tickIsEven = tick % 2 == 0;

                    if (hasMachted && trickBiggerAs && tackLimit && tickIsEven) {
                        System.out.println("Tick: " + tick);
                        System.out.println("Trick: " + trick);
                        System.out.println("Tack: " + tack);
                        System.out.println();
                    }

                }
            }
        }

    }
}
