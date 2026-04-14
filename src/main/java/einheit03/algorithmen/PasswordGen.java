package einheit03.algorithmen;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Generiert ein zufälliges Passwort mit einer variablen Länge (8-12 Zeichen).
 */
public class PasswordGen {
    static void main() {
        int laenge = ThreadLocalRandom.current().nextInt(8, 13);
        StringBuilder passwort = new StringBuilder();

        for (int i = 0; i < laenge; i++) {
            // Generiere zufällige druckbare Zeichen (ASCII 33 bis 126)
            char zeichen = (char) ThreadLocalRandom.current().nextInt(33, 127);
            passwort.append(zeichen);
        }

        System.out.println("Generiertes Passwort: " + passwort);
    }
}
