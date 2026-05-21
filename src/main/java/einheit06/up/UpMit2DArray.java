package einheit06.up;

import java.util.Arrays;

public class UpMit2DArray {

    static void main() {


        int[][] matrix2 = { // beliebig groß sein - 100
                {1, 3, 4},
                {4, 5, 2},
                {4, 5, 2}
        };


        int ergebnisDiagonale = berechneDiagonale(matrix2);
        System.out.println(ergebnisDiagonale);


        int[][] megaMatrix = createMegaMatrix();
        System.out.println(Arrays.deepToString(megaMatrix));
        System.out.println(berechneDiagonale(megaMatrix));


    }

    private static int[][] createMegaMatrix() {
        int[][] megaIntst = new int[100][100];

        for (int i = 0; i < megaIntst.length; i++) {
            for (int j = 0; j < megaIntst.length; j++) {
                megaIntst[i][j] = i + j;
            }
        }


        return megaIntst;
    }

    public static int berechneDiagonale(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
        }

        return sum;
    }

}
