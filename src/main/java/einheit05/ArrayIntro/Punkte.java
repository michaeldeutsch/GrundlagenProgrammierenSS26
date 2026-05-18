package einheit05.ArrayIntro;

import java.util.Arrays;

public class Punkte {

    static void main() {


        int zahl1 = 1; // Variable

        int[] punkte = new int[10];

        punkte[0] = 111;
        punkte[9] = 5;

        punkte[9] = punkte[9] + 2;


        System.out.println(Arrays.toString(punkte));

    }
}
