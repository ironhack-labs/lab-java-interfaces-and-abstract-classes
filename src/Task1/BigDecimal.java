package Task1;

import java.math.RoundingMode;

public class BigDecimal {

    public static double roundToHundredth(java.math.BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double reverseSignAndRoundToTenth(java.math.BigDecimal number) {
        java.math.BigDecimal reversed = number.negate();
        return reversed.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}