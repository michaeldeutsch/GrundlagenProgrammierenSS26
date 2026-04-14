package einheit03.zeit;

/**
 * Simuliert einen Countdown von 10 Sekunden.
 */
public class CountDown {
    static void main() throws InterruptedException {
        System.out.println("Countdown startet...");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + "...");
            Thread.sleep(1000);
        }
        System.out.println("Liftoff!");
    }
}
