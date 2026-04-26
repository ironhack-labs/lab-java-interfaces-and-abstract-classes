package com.practice2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtils {

    public static double round(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double changeSign(BigDecimal number) {
        return number
                .negate()
                .setScale(1, RoundingMode.HALF_UP)
                .doubleValue();
    }
}