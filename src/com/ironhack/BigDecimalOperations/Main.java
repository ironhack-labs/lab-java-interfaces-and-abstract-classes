package com.ironhack.BigDecimalOperations;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal num3 = new BigDecimal("-45.67");

        double rounded = BigDecimalOperations.roundToHundredth(num1);
        BigDecimal reversedAndRounded1 = BigDecimalOperations.reverseSignAndRoundToTenth(num2);
        BigDecimal reversedAndRounded2 = BigDecimalOperations.reverseSignAndRoundToTenth(num3);

        System.out.println("Rounded to hundredth: " + rounded);
        System.out.println("Reversed and rounded (1.2345): " + reversedAndRounded1);
        System.out.println("Reversed and rounded (-45.67): " + reversedAndRounded2);
    }
}
