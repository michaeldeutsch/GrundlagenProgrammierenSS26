package zt2;

public class Matrix {
    static void main(String[] args) {
        char[][] matrix = new char[100][100]; // 10.000 Felder
        int besteZeile = 0;
        int maxVorkommen = -1;

        for (int z = 0; z < matrix.length; z++) {
            for (int s = 0; s < matrix[z].length; s++) {
                matrix[z][s] = (char) ('a' + (int) (Math.random() * 5)); // a bis e
            }

            int vorkommen = zaehleABC(matrix[z]);
            if (vorkommen > maxVorkommen) {
                maxVorkommen = vorkommen;
                besteZeile = z;
            }
        }

        System.out.println("In der Zeile " + besteZeile
                + " gibt es die meisten 'abc'-Vorkommen: " + maxVorkommen);

        for (int i = 0; i < matrix[besteZeile].length; i++) {
            System.out.print(matrix[besteZeile][i]);
        }
    }

    public static int zaehleABC(char[] zeile) {
        int anzahl = 0;

        for (int i = 0; i < zeile.length - 2; i++) {
            if (zeile[i] == 'a' && zeile[i + 1] == 'b' && zeile[i + 2] == 'c') {
                anzahl++;
            }
        }

        return anzahl;
    }
}
