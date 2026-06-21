public class BigDecimalUtils {
    /**
     * Rounds the given BigDecimal to the nearest hundredth and returns a double.
     */
    public static double roundToHundredths(java.math.BigDecimal value) {
        if (value == null) return 0.0;
        return value.setScale(2, java.math.RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Reverses the sign of the given BigDecimal, rounds to nearest tenth, and returns a double.
     */
    public static double reverseSignAndRoundToTenth(java.math.BigDecimal value) {
        if (value == null) return 0.0;
        java.math.BigDecimal reversed = value.negate();
        return reversed.setScale(1, java.math.RoundingMode.HALF_UP).doubleValue();
    }
}
