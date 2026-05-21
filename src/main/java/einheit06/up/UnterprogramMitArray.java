package einheit06.up;

public class UnterprogramMitArray {

    static void main() {

        int[] zahlen = {1, 2, 3, 4, 5};
        int gesuchterWert = 3;

        boolean ergebnis = werteVorhanden(gesuchterWert, zahlen);
        System.out.println(ergebnis);
        System.out.println(ergebnis ? "Habe gefunden" : "nicht gefunde");

        System.out.println(werteVorhanden(44, zahlen));


    }

    private static boolean werteVorhanden(int gesuchterWert, int[] zahlen) {
        // 1, 354 6,6 32,4
        for (int zahl : zahlen) {
            if (gesuchterWert == zahl) {
                return true;
            }
        }

        return false;
    }


}
