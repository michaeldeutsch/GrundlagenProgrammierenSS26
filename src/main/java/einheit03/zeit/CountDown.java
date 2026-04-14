package einheit03.zeit;

public class CountDown {

    static void main() throws InterruptedException {


        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
