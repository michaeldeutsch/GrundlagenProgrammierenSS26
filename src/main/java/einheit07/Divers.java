package einheit07;

import java.util.TreeSet;

public class Divers {

    static void main(String[] args) {
        TreeSet<String> usernames = new TreeSet<>();

        usernames.add("Michael");
        usernames.add("Michael");
        usernames.add("ZEbra");
        usernames.add("Ameise");

        System.out.println("Usernames (sortiert und ohne Duplikate): " + usernames);
    }
}
