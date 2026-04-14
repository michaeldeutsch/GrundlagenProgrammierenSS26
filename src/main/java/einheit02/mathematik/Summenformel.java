package einheit02.mathematik;

/**
 * Berechnet die Summe und den Durchschnitt aller geraden Zahlen in einem definierten Bereich.
 */
public class Summenformel {
    static void main() {
        int start = 1;
        int ende = 100;
        int summe = 0;
        int anzahl = 0;

        for (int i = start; i <= ende; i++) {
            if (i % 2 == 0) {
                summe += i;
                anzahl++;
            }
        }

        double durchschnitt = anzahl > 0 ? (double) summe / anzahl : 0;

        System.out.println("Summe der geraden Zahlen von " + start + " bis " + ende + ": " + summe);
        System.out.println("Durchschnitt: " + durchschnitt);
    }
}
