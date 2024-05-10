package Bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDoc {
    private static String[] args;

    public static double roundToNearestHundredth(BigDecimal number) {
        BigDecimal roundedNumber = number.setScale(2, BigDecimal.ROUND_HALF_UP);
        return roundedNumber.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("4.2545");
        System.out.println(roundToNearestHundredth(number));
    }



}
