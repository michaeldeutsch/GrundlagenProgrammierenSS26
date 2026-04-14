package einheit02.schleife;

import javax.swing.*;

/**
 * Demonstriert eine einfache Authentifizierungslogik mittels String-Vergleichen und Dialogfenstern.
 */
public class Login {
    static void main() {
        final String correctUsername = "Michael";
        final String correctPassword = "123";

        String usernameInput = "Michael";
        String passwordInput = "123";

        if (correctUsername.equalsIgnoreCase(usernameInput) && correctPassword.equals(passwordInput)) {
            JOptionPane.showMessageDialog(null, "Anmeldung erfolgreich. Guten Tag " + usernameInput + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Benutzername oder Passwort falsch.", "Login Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }
}
