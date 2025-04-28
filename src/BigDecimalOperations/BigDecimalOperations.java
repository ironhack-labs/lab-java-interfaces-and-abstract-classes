package BigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double roundToDecimal(BigDecimal num, int decimalPlaces) {
        BigDecimal rounded = num.setScale(decimalPlaces, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    public static double reverseSignAndRoundToTenth(BigDecimal num) {
        BigDecimal reversed = num.negate(); // reverse the sign
        return roundToDecimal(reversed, 1);
    }

    public static void main(String[] args) {
        BigDecimal testValue1 = new BigDecimal("1.2345");
        BigDecimal testValue2 = new BigDecimal("-45.67");

        double result1 = reverseSignAndRoundToTenth(testValue1);
        double result2 = reverseSignAndRoundToTenth(testValue2);

        System.out.println(result1); // Expected: -1.2
        System.out.println(result2); // Expected: 45.7
    }
}
