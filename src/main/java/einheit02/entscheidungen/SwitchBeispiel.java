package einheit02.entscheidungen;

/**
 * Beispiel für die klassische switch-Syntax zur Fallunterscheidung.
 */
public class SwitchBeispiel {
    static void main() {
        int monat = 1;

        switch (monat) {
            case 1, 4, 7, 10:
                System.out.println("Jänner");
                break;
            case 2:
                System.out.println("Februar");
                break;
            case 3:
                System.out.println("März");
                break;
            default:
                System.out.println("Unbekannter Monat");
        }
    }
}
