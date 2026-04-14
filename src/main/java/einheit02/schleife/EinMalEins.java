package einheit02.schleife;

/**
 * Gibt das kleine Einmaleins (1 bis 10) auf der Konsole aus.
 */
public class EinMalEins {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
