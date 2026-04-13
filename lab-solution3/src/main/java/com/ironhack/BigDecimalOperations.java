package com.ironhack;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Operaciones de precisión con BigDecimal.
 */
public class BigDecimalOperations {

    /**
     * Redondea a la centésima más cercana (2 decimales).
     */
    public static double roundToHundredth(BigDecimal value) {
        if (value == null) return 0.0;
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Invierte el signo y redondea a la décima más cercana (1 decimal).
     */
    public static BigDecimal inverseAndRoundToTenth(BigDecimal value) {
        if (value == null) return BigDecimal.ZERO;
        return value.negate().setScale(1, RoundingMode.HALF_UP);
    }
}