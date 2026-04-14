package einheit02.schleife;

/**
 * Einführung in die for-Schleife und Inkrement-/Dekrement-Operatoren.
 */
public class ForSchleife {
    static void main() {
        System.out.println("Beispiel für for-Schleifen");

        // Inkrement- und Dekrement-Operatoren
        int j = 1;
        j++;
        System.out.println("j nach j++: " + j);

        // Ausgabe ungerader Zahlen von 1 bis 10
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("i: " + i);
        }
    }
}
