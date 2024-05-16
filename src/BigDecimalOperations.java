import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double reverseSignAndRoundToNearestTenth(BigDecimal number) {
        return number.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("4.2545");
        BigDecimal number2 = new BigDecimal("-45.67");

        System.out.println(roundToNearestHundredth(number1)); // Output: 4.25
        System.out.println(reverseSignAndRoundToNearestTenth(number1)); // Output: -4.3
        System.out.println(reverseSignAndRoundToNearestTenth(number2)); // Output: 45.7
    }
}