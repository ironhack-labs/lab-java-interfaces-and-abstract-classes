package com.ironhack.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTasks {
    public static void main(String[] args) {
        BigDecimal input = BigDecimal.valueOf(4.2545);
        double inputToDouble = returnDouble(input);
        System.out.println("inputToDouble: " + inputToDouble);

        BigDecimal input2=BigDecimal.valueOf(1.2345);
        double inputReverseSign=returnReverseSign(input2);
        System.out.println("inputReverseSign: " + inputReverseSign);



    }

    public static double returnDouble(BigDecimal input) {
        return input.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double returnReverseSign(BigDecimal input) {
        return input.negate().setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}

