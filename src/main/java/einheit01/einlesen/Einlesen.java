package einheit01.einlesen;

import java.util.Scanner;

/**
 * Demonstriert das Einlesen von Benutzereingaben über die Konsole mit der Scanner-Klasse.
 */
public class Einlesen {
    static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Bitte geben Sie eine Zahl ein:");
            String input = scan.nextLine();

            System.out.println("Ihre Eingabe war: " + input);
        }
    }
}
