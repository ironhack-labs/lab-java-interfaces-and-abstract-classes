package com.ironhack.BigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtils {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal rounded = num1.setScale(2, RoundingMode.HALF_UP);
        System.out.println(rounded.doubleValue());

        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal reversed2 = num2.negate();
        System.out.println(reversed2.setScale(1, RoundingMode.HALF_UP));

        BigDecimal num3 = new BigDecimal("-45.67");
        BigDecimal reversed3 = num3.negate();
        System.out.println(reversed3.setScale(1, RoundingMode.HALF_UP));


    }
}
