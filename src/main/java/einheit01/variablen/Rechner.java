package einheit01.variablen;

/**
 * Demonstriert grundlegende arithmetische Operationen und den Wertebereich von Datentypen.
 */
public class Rechner {
    static void main(String[] args) {
        int zahl1 = 10;
        int zahl2 = 20;
        int summe = zahl1 + zahl2;

        System.out.println("Summe (direkt): " + (zahl1 + zahl2));
        System.out.println("Summe (Variable): " + summe);

        System.out.println("Minimaler Wert von Integer: " + Integer.MIN_VALUE);
        System.out.println("Maximaler Wert von Integer: " + Integer.MAX_VALUE);
    }
}
