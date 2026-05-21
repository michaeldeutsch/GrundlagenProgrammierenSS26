package einheit06.up;

public class Unterprogramme {

    static void main() {

        summieren(3, 4);
        summieren(5, 6);
        summieren(7, 8);
        summieren(9, 10);

        String nachricht = generiereAnrede("Michael", true); // Herr Michael
        System.out.println(nachricht);

        System.out.println(generiereAnrede("Maria", false));


    }

    public static String generiereAnrede(String name, boolean geschlecht) {

        String anrede = "";

        if (geschlecht) {
            anrede = "Herr ";
        } else {
            anrede = "Frau ";
        }

        return anrede + name;
    }

    // außerhalb der Main, innerhalb der Klasse

    public static void summieren(int zahl1, int zahl2) {
        int summe = zahl1 + zahl2;

        System.out.println(summe);

    }


}
