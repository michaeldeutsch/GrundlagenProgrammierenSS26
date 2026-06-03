package einheit07;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Runden {
    static void main(String[] args) {
        double number = 3.7;

        long rounded = Math.round(number);   // 4
        System.out.println("Math.round(3.7): " + rounded);

        // Abrunden
        double floored = Math.floor(number);       // 3.0
        System.out.println("Math.floor(3.7): " + floored);

        // Aufrunden
        double ceiled = Math.ceil(number);       // 4.0
        System.out.println("Math.ceil(3.7): " + ceiled);

        double pi = 3.14159;
        double roundedPi = Math.round(pi * 100.0) / 100.0;  // 3.14
        System.out.println("Pi gerundet (2 Stellen): " + roundedPi);

        BigDecimal value1 = new BigDecimal("3.14159");
        value1 = value1.setScale(2, RoundingMode.HALF_UP);
        System.out.println("BigDecimal HALF_UP: " + value1);

        BigDecimal value2 = new BigDecimal("3.14159");
        value2 = value2.setScale(2, RoundingMode.UP);
        System.out.println("BigDecimal UP: " + value2);

        BigDecimal value3 = new BigDecimal("3.14159");
        value3 = value3.setScale(2, RoundingMode.DOWN);
        System.out.println("BigDecimal DOWN: " + value3);
    }
}
