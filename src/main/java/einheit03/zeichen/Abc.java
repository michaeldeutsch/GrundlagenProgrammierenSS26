package einheit03.zeichen;

/**
 * Demonstriert den Zusammenhang zwischen ASCII-Werten und Zeichen (char).
 */
public class Abc {
    static void main() {
        int zeichenAlsWert = 99;
        char zeichen = (char) zeichenAlsWert;

        System.out.println("Zeichen für Wert 99: " + zeichen);

        int reverse = zeichen;
        System.out.println("Wert für Zeichen '" + zeichen + "': " + reverse);

        System.out.print("Alphabet: ");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
