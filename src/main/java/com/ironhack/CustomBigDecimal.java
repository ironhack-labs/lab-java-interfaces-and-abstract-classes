package com.ironhack;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class CustomBigDecimal {

    // Method1 that accepts a BigDecimal, rounds it to the nearest hundredth, and returns a double
    public static double roundToNearestHundredthNumber(BigDecimal number) {
        // First Step : Rounding to the nearest hundredth
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);

        // Second Step : returns a double
        return rounded.doubleValue();
    }
    // Method2 that accepts a BigDecimal, rounds it to the tenth
    public static double roundToNearestTenthNumber(BigDecimal number){
        // First Step : Rounding to the nearest Tenth
        BigDecimal rounded = number.setScale(1, RoundingMode.HALF_UP);
        //second step :returns a revers sign number
       // return rounded.doubleValue() * (number.signum() * -1);
        return rounded.negate().doubleValue();
    }

}