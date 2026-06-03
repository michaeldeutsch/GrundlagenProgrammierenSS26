package einheit07;

import java.util.TreeSet;

public class TreeSetExample {

    static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4); // Duplikat, wird ignoriert
        numbers.add(5); // Duplikat, wird ignoriert
        numbers.remove(3);

        System.out.println("TreeSet Inhalt (sortiert):");
        numbers.forEach(System.out::println);
    }
}
