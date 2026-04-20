package tests.zt1;

public class ReiheBerechnungGrenze {
    static void main(String[] args) {
        double summe = 0.0;
        int i;

        for (i = 1; summe >= -0.77; i++) {
            double term = 1.0 / i;

            if (i % 3 == 1) { // 1 % 3 = 1 -> +, 4 / 3 = 1 -> +
                summe += term;
            } else { // 2 % 3 = 2 -> -, 3 % mod 3 = 0 -> -
                summe -= term;
            }
        }


        System.out.println("Die Partialsumme unterschreitet -0.77 erstmals bei n = " + (i - 1));
        System.out.println("Wert der Partialsumme: " + summe);
    }
}
