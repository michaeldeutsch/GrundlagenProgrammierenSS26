package einheit07;

import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Lottoschein {
    static void main(String[] args) {
        TreeSet<Integer> lottoschein = new TreeSet<>();

        while (lottoschein.size() < 6) {
            int zahl = ThreadLocalRandom.current().nextInt(1, 46);
            lottoschein.add(zahl);
        }

        System.out.println("Lottozahlen: " + lottoschein);
    }
}
