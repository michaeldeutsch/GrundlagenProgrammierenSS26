package einheit02;

import javax.swing.*;

public class Login {

    static void main() {

        String CORRECT_USERNAME = "Michael";
        String CORRECT_PASSWORD = "Michael";


        String userInput2 = "hh";
        String passwordInput = "Michael";

        if(CORRECT_USERNAME.equalsIgnoreCase(userInput2)  &&  CORRECT_PASSWORD.equals(passwordInput)){ // 1:1
            JOptionPane.showMessageDialog(null, "Guten Tag " + userInput2);
        }else{
            JOptionPane.showMessageDialog(null, "Falscher Benutzername oder Passwort");
        }




    }

}
