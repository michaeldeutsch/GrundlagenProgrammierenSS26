package einheit05.DoubleArray;

import java.util.Arrays;

public class Intro2dArray {


    static void main() {

        int[][] matrix = new int[8][8];

        matrix[0][0] = 9;
        matrix[1][1] = 10;

        System.out.println(Arrays.deepToString(matrix));

        for (int zeile = 0; zeile < matrix.length; zeile++) {
            for (int spalte = 0; spalte < matrix.length; spalte++) {

                System.out.print(matrix[zeile][spalte] + "\t");
            }
            System.out.println();
        }


    }
}
