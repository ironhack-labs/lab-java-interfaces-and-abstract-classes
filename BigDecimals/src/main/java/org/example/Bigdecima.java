package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bigdecima {
    public static double rounToHundred(BigDecimal value) {

        BigDecimal rounder = value.setScale(2, RoundingMode.HALF_UP);
        return rounder.doubleValue();
    }
    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number){
        BigDecimal opp=number.negate();
        BigDecimal result = opp.setScale(1, RoundingMode.HALF_UP);

        return result;
    }
}
