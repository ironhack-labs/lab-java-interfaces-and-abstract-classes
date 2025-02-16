package com.ironhack.lab108.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args) {

        BigDecimal decimal = new BigDecimal("4.2545");

        System.out.println("################# Task1 #################\n");
        System.out.println("Rounded from: " + decimal + " to: " + roundDecimal(decimal));

        System.out.println("\n################# Task2 #################\n");
        System.out.println(decimal + " --> " + reverseSign(decimal));
    }

//    Create a method that accepts a BigDecimal and returns a double of the BigDecimal number rounded to the nearest hundredth.
//    For example, 4.2545 should return 4.25.
    public static double roundDecimal(BigDecimal decimal){
//        decimal = new BigDecimal(4.2545);
        BigDecimal roundValue = decimal.setScale(2, RoundingMode.HALF_UP);

        return roundValue.doubleValue();
    }

//    create a method that accepts a BigDecimal,
//    reverses the sign (if the parameter is positive, the result should be negative and vice versa),
//    rounds the number to the nearest tenth and returns the result.
//    For example, 1.2345 should return -1.2 and -45.67 should return 45.7.
    public static BigDecimal reverseSign(BigDecimal decimal){
//        BigDecimal negative = new BigDecimal("-1");

        if (decimal.signum() > 0) {
            // Method .negate() returns a BigDecimal whose value is the opposite sign of the original
            decimal = decimal.negate().setScale(1, RoundingMode.HALF_UP);
        } else if (decimal.signum() < 0) {
            decimal = decimal.negate().setScale(1, RoundingMode.HALF_UP);
        }

        return decimal;
    }
}
