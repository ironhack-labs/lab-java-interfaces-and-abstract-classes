package org.ironhack.envsetup;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtils {
    public static double roundToHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseAndRound(BigDecimal number) {
        BigDecimal reversed = number.negate();
        return reversed.setScale(1, RoundingMode.HALF_UP);
    }
}
