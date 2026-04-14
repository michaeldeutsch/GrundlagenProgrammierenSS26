package einheit03.zeit;

/**
 * Simuliert den Verlauf einer 24-Stunden-Uhr (Stunden, Minuten, Sekunden).
 */
public class Uhrzeit {
    static void main() {
        for (int stunden = 0; stunden < 24; stunden++) {
            for (int minuten = 0; minuten < 60; minuten++) {
                for (int sekunden = 0; sekunden < 60; sekunden++) {
                    // Formatiert die Uhrzeit mit führenden Nullen
                    System.out.printf("%02d:%02d:%02d%n", stunden, minuten, sekunden);
                }
            }
        }
    }
}
