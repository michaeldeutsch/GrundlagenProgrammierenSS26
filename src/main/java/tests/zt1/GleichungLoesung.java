package tests.zt1;

public class GleichungLoesung {
    static void main(String[] args) {
        int count = 0;

        for (int a = 1; a <= 99; a++) {
            for (int b = 1; b <= 99; b++) {
                for (int x = 1; x <= 99; x++) {
                    for (int y = 1; y <= 99; y++) {

                        if (a + b == 15 && x + y == 25 && a + x == 24) {
                            System.out.println("a=" + a + ", b=" + b + ", x=" + x + ", y=" + y);
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println("Anzahl der Lösungen: " + count);
    }
}
