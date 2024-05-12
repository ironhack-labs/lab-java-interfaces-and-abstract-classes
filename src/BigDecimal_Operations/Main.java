package BigDecimal_Operations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal(Math.PI);
        System.out.println("\nTask 1:");
        System.out.println("The entered BigDecimal number is:\n" + a);
        double d = a.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        System.out.println("The double of the BigDecimal number rounded to the nearest hundredth is:\n" + d);

        System.out.println("\nTask 2:");
        BigDecimal b = new BigDecimal(-Math.PI);
        System.out.println("The entered BigDecimal number is:\n" + b);
        BigDecimal reverse = new BigDecimal(-1);
        BigDecimal c = b.multiply(reverse);
        double result = c.setScale(1 , RoundingMode.HALF_EVEN).doubleValue();
        System.out.println("The BigDecimal number reversed and rounded to the nearest tenth is:\n" + result);
    }
}

