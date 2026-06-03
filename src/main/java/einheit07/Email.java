package einheit07;

public class Email {
    static void main(String[] args) {
        String email = "michael.deutsch@fh-vie.ac.at";
        int indexDot = email.indexOf(".");

        String firstName = email.substring(0, indexDot);
        System.out.println("Vorname: " + firstName);

        System.out.println("Beispiel-String in Großbuchstaben: " + "test".toUpperCase());
    }
}
