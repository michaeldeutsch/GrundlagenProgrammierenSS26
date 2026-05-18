package einheit05.ArrayIntro;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AllYearLong {

    static void main() {

        // 365 days, avg_temp, max_temp, min_temp
        // 1-30 --> overview
        // max_temp -> Mehrfachnennung sind nichtig
        // min_temp -> Mehrfachnennung sind nichtig
        // avg_temp -> Durchschnittstemperatur

        int[] year = new int[365];
        int max = -1;
        int min = 100;
        int sum = 0;
        int anzahlDerTage = year.length;

        for (int tag = 0; tag < year.length; tag++) {
            year[tag] = ThreadLocalRandom.current().nextInt(1, 30 + 1);

            if (year[tag] > max) {
                max = year[tag];
            }

            if (year[tag] < min) {
                min = year[tag];
            }

            // sum = sum +  year[tag];
            sum += year[tag];


        }

        System.out.println(Arrays.toString(year));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("AVG: " + sum / anzahlDerTage);
        // System.out.println("Silvester-temp war/ist " + year[364]);


    }
}
