package einheit03;

public class Enthausen {

    static void main() {

        int vermoegen = 500;
        // Trick, Tick, Tack
        // Erbekonstellation, alle Möglichkeinten, Anzahl der Möglichkeiten
        // alles muss vergeben werden
        // Jede Kombination hat eine Varianten-ID:
        // wie viele Kombis es gab


        for (int tick = 1; tick < vermoegen; tick++) {
            for (int trick = 1; trick < vermoegen; trick++) {
                for (int tack = 1; tack < vermoegen; tack++) {
                    // Grundgerüst, 3 Schleifen, mit Anfangs- und Endwert
                    int summe = tick + trick + tack;

                    if (summe == vermoegen) {
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
