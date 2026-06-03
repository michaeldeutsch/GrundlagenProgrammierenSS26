package einheit07;

import java.util.ArrayList;

public class ArraySubsti {

    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Start-Größe: " + numbers.size());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Größe nach Hinzufügen: " + numbers.size());

        boolean contains22 = numbers.contains(22);
        System.out.println("Enthält 22? " + contains22);

        numbers.remove(Integer.valueOf(2));
        System.out.println("Größe nach Entfernen von '2': " + numbers.size());

        System.out.println("Inhalt der Liste:");
        numbers.forEach(System.out::println);
    }
}
