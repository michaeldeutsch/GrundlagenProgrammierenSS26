package einheit07;

public class Palindrom {

    static void main(String[] args) {
        String original = "lagerregal";
        String reversed = "";

        for (int i = 0; i < original.length(); i++) {
            char currentChar = original.charAt(i);
            reversed = currentChar + reversed;
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        System.out.println(original.equals(reversed) ? "Es ist ein Palindrom" : "Es ist kein Palindrom");

        // Beispiel mit StringBuilder zum Umdrehen eines Strings
        StringBuilder sb = new StringBuilder("Hallo");
        sb.reverse();
        System.out.println("Hallo umgedreht: " + sb);
    }
}
