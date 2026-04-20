package einheit04;

import java.util.concurrent.ThreadLocalRandom;

public class WhileIntro {

    static void main() {

        boolean gameOn = true;
        int count = 0;
        int sechserCounter = 0;

        while (gameOn) {
            count++;
            int wurf = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            System.out.println(wurf);

            if (wurf == 6) {
                sechserCounter++;
                
                if (sechserCounter == 3) {
                    gameOn = false;
                }
            } else {
                sechserCounter = 0;
            }


        }


    }
}
