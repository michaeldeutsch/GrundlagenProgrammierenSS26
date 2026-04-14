package einheit03.schleife;

/**
 * Zeigt Besonderheiten der for-Schleife, wie den vorzeitigen Abbruch mit break.
 */
public class ForSonderheiten {
    static void main() {
        System.out.println("Schleife bis 10, Abbruch bei 5:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
