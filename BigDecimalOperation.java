import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperation {

    public static BigDecimal reverseSignAndRoundToNearestTenth(BigDecimal number) {
        // Reverse the sign of the number
        BigDecimal negatedNumber = number.negate();
        // Set scale to 1 (nearest tenth) and round using HALF_UP rounding mode
        BigDecimal roundedNumber = negatedNumber.setScale(1, RoundingMode.HALF_UP);
        // Return the result
        return roundedNumber;
    }

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("1.2345");
        BigDecimal number2 = new BigDecimal("-45.67");

        BigDecimal result1 = reverseSignAndRoundToNearestTenth(number1);
        BigDecimal result2 = reverseSignAndRoundToNearestTenth(number2);

        System.out.println("Original: " + number1 + " -> Result: " + result1);  // Output should be -1.2
        System.out.println("Original: " + number2 + " -> Result: " + result2);  // Output should be 45.7
    }
}
