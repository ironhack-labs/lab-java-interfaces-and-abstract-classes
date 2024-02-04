package src;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalWorkshop {

    private static double round(BigDecimal number, int newScale) {
        return number.setScale(newScale, RoundingMode.HALF_UP).doubleValue();
    }
    public static double toDouble (BigDecimal number) {
        return round(number, 2);
    }

    public static double changeSignAndRound(BigDecimal number) {
        return round(number.multiply(BigDecimal.valueOf(-1)), 1);
    }
}
