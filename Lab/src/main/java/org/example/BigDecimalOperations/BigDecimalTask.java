package org.example.BigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTask {
    public BigDecimalTask() {
    }

    public static double nearestHundredth(BigDecimal value) {
        if (value == null) throw new IllegalArgumentException("value is null");
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseNearestTenth(BigDecimal value) {
        if (value == null) throw new IllegalArgumentException("value is null");
        return value.negate().setScale(1, RoundingMode.HALF_UP);
    }
}
