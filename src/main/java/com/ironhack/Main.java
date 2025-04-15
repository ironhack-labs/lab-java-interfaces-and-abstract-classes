package com.ironhack;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal input1 = new BigDecimal("-18.1258");
        double result1 = CustomBigDecimal.roundToNearestHundredthNumber(input1);
        System.out.println("Result1 is : " + result1); // Résultat : 4.25

        BigDecimal input2 = new BigDecimal("-100.235");
        double result2 = CustomBigDecimal.roundToNearestTenthNumber(input2);
        System.out.println("Result2 is: "+result2 );

        BigDecimal input3 = new BigDecimal(result2);

        double result3 = input3.negate().doubleValue();

        System.out.println("Result3 is: "+result3 );
    }
}

