package einheit05.ArrayIntro;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Occupied {
    static void main(String[] args) {
        boolean[] occupied = new boolean[10]; // false, false, false

        System.out.println(Arrays.toString(occupied));

        boolean allCovered = false;
        int count = 1;

        while (!allCovered) {
            System.out.println("Round " + count++);
            int currentPosition = ThreadLocalRandom.current().nextInt(0, 10);
            occupied[currentPosition] = true;

            allCovered = true;

            for (int i = 0; i < occupied.length; i++) {
                if (!occupied[i]) {
                    allCovered = false;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(occupied));
    }
}
