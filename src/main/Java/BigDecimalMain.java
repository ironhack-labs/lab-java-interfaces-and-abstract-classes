package Java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMain {


    public static double roundToHundredth(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }


    public static BigDecimal reverseSignAndRound(BigDecimal number) {
        BigDecimal reversed = number.negate();
        return reversed.setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println(roundToHundredth(num1));


        BigDecimal num2 = new BigDecimal("1.2345");
        System.out.println(reverseSignAndRound(num2));


        BigDecimal num3 = new BigDecimal("-45.67");
        System.out.println(reverseSignAndRound(num3));

    }


}


