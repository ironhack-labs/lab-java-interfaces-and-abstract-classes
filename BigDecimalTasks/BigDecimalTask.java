import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Utility class providing precise rounding operations using BigDecimal.
 * All methods handle null input safely by throwing IllegalArgumentException.
 */
public class BigDecimalTask {

    /**
     * Rounds the given BigDecimal to 2 decimal places (nearest hundredth)
     * using HALF_UP rounding mode and returns the result as a double.
     *
     * @param value the BigDecimal value to round
     * @return the rounded value as a primitive double
     * @throws IllegalArgumentException if value is null
     */
    public static double roundToNearestHundredth(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Negates the given BigDecimal (changes its sign) and rounds the result
     * to 1 decimal place (nearest tenth) using HALF_UP rounding mode.
     *
     * Examples:
     *   1.2345  → -1.2
     *  -45.67   →  45.7
     *
     * @param value the BigDecimal value to negate and round
     * @return a new BigDecimal with negated sign and rounded to 1 decimal place
     * @throws IllegalArgumentException if value is null
     */
    public static BigDecimal negateAndRoundToTenth(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        return value.negate().setScale(1, RoundingMode.HALF_UP);
    }

    /**
     * Main method containing demonstration/test cases.
     * Can be safely removed before final submission if not required.
     */
    public static void main(String[] args) {
        // Test case 1: rounding to hundredth
        BigDecimal a = new BigDecimal("4.2545");
        System.out.println("4.2545 rounded to 2 decimals → " + roundToNearestHundredth(a));  // Expected: 4.25

        // Test case 2: positive → negative, round to tenth
        BigDecimal b = new BigDecimal("1.2345");
        System.out.println("1.2345 negated & rounded to 1 decimal → " + negateAndRoundToTenth(b));  // Expected: -1.2

        // Test case 3: negative → positive, round to tenth
        BigDecimal c = new BigDecimal("-45.67");
        System.out.println("-45.67 negated & rounded to 1 decimal → " + negateAndRoundToTenth(c));  // Expected: 45.7

        // Additional edge case: exact value (no rounding needed)
        BigDecimal d = new BigDecimal("10.0");
        System.out.println("10.0 negated & rounded → " + negateAndRoundToTenth(d));  // Expected: -10.0
    }
}