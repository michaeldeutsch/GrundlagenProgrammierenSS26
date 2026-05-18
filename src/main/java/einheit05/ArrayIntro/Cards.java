package einheit05.ArrayIntro;

public class Cards {

    static void main() {

        String[] oberbekleidung = {"Pullover", "Shirt", "Bluse", "Hemd"};
        String[] unterbekleidung = {"Hose", "Rock", "Leggin", "Short"};
        String[] schuhe = {"Sneaker", "Pumps", "Schlapfen", "Stiefel"};
        int count = 1;

        for (int i = 0; i < oberbekleidung.length; i++) {
            for (int j = 0; j < unterbekleidung.length; j++) {
                for (int k = 0; k < schuhe.length; k++) {
                    System.out.println("Style " + count++ + ":");
                    System.out.println(oberbekleidung[i] + " " + unterbekleidung[j] + " " + schuhe[k]);
                    System.out.println("-".repeat(22));
                }
            }
        }


    }
}
