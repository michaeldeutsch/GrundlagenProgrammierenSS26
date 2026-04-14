package einheit02.entscheidungen;

/**
 * Ermittelt eine Note basierend auf einer erreichten Punktzahl (Score).
 */
public class Notengebung {
    static void main() {
        int score = 66;

        if (score > 90) {
            System.out.println("Sehr gut");
        } else if (score > 80) {
            System.out.println("Gut");
        } else if (score > 70) {
            System.out.println("Befriedigend");
        } else if (score > 60) {
            System.out.println("Genügend");
        } else {
            System.out.println("Nicht genügend");
        }
    }
}
