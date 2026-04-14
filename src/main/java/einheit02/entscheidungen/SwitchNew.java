package einheit02.entscheidungen;

/**
 * Demonstriert die moderne switch-Syntax (Arrow-Notation) und den Vergleich von Strings.
 */
public class SwitchNew {
    static void main() {
        int monat = 1;

        switch (monat) {
            case 1, 2, 3 -> System.out.println("Winter");
            case 4, 5, 6 -> System.out.println("Frühling");
            case 7, 8, 9 -> System.out.println("Sommer");
            case 10, 11, 12 -> System.out.println("Herbst");
            default -> System.out.println("Unbekannt");
        }

        String landCode = "DE";
        switch (landCode.toUpperCase()) {
            case "DE" -> System.out.println("Deutschland");
            case "AT" -> System.out.println("Österreich");
            default -> System.out.println("Unbekanntes Land");
        }
    }
}