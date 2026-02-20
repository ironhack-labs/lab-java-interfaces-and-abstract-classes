package com.ironhack;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number) {
        BigDecimal reversed = number.negate();
        return reversed.setScale(1, RoundingMode.HALF_UP);
    }

}
