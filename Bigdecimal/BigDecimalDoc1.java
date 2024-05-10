package Bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDoc1 {

    public  static double reverseSignAndRoundToNearestTenth(BigDecimal number) {
        BigDecimal reversedNumber = number.negate().setScale(1, BigDecimal.ROUND_HALF_UP);
        return reversedNumber.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("1.2345");
        BigDecimal number2 = new BigDecimal("-45.67");
        System.out.println(reverseSignAndRoundToNearestTenth(number1));
        System.out.println(reverseSignAndRoundToNearestTenth(number2));
    }
}
