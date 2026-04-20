package einheit04;

import java.util.Scanner;

public class DoWhileExample {

    static void main() {
        // es gibt Benutzerdaten - DB-side
        int versuche = 0;
        int MAX_VERSUCHE = 3;
        String CORRECT_PWD = "ADMIN";
        String USER_INPUT = "ADMIN";
        Scanner scan = new Scanner(System.in);


        boolean pwdCorrect;
        boolean userNameCorrect;
        do {
            versuche++;
            System.out.println("Bitte Benutzername eingeben: ");
            String userNameInput = scan.nextLine();

            System.out.println("Bitte Passwort eingeben");
            String userPasswortInput = scan.nextLine();

            pwdCorrect = CORRECT_PWD.equals(userPasswortInput);
            userNameCorrect = userNameInput.equals(USER_INPUT);


        } while (!(pwdCorrect && userNameCorrect) && versuche < MAX_VERSUCHE);
        // 3 < 3 false

        System.out.println("Versuche: " + versuche);
        if (versuche < MAX_VERSUCHE) {
            System.out.println("Erfolgreich eingeloggt!");
        } else {
            System.out.println("Sie wurden gesperrt");
        }


    }
}
