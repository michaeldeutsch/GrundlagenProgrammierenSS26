package einheit03.zeichen;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Demonstriert den Umgang mit Zeichen (char) und die Generierung von Zufallswerten.
 */
public class CharacterDemo {
    static void main(String[] args) {
        // Beispiel für ein zufälliges Zeichen im Bereich 'a' bis 'z'
        int zufallsWert = ThreadLocalRandom.current().nextInt('a', 'z' + 1);
        char zufallsZeichen = (char) zufallsWert;

        System.out.println("Zufälliges Zeichen: " + zufallsZeichen + " (ASCII: " + zufallsWert + ")");
    }
}
