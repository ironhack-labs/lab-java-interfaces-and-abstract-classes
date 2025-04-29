package BigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal number1 = new BigDecimal("4.2545");

        System.out.println(number1.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(number1.negate().setScale(2, RoundingMode.HALF_EVEN));


    }
}
