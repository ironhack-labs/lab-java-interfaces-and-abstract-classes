package com.ironhack;

import java.math.RoundingMode;
import java.math.BigDecimal;


public class BigDecimalOperations {

    public static double roundToHundredth(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, BigDecimal.ROUND_HALF_UP);

    return rounded.doubleValue();
    }

    public static double invertAndRound(BigDecimal number) {
        BigDecimal inverted = number.negate();
        BigDecimal rounded = inverted.setScale(1, BigDecimal.ROUND_HALF_UP);

        return rounded.doubleValue();

    }
}
