package einheit01.verzweigung;

/**
 * Einführung in Kontrollstrukturen mittels einfacher If-Else-Verzweigungen.
 */
public class Verzweigung {
    static void main(String[] args) {
        int zahl = 10;

        if (zahl % 2 == 0) {
            System.out.println("Zahl " + zahl + " ist gerade.");
        } else {
            System.out.println("Zahl " + zahl + " ist ungerade.");
        }
    }
}
