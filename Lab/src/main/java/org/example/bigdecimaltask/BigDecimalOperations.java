package org.example.bigdecimaltask;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.2525");
        double result = scaleValue(num1);

        BigDecimal num2 = new BigDecimal("-45.67");
        BigDecimal result2 = reverseAndAround(num2);
        System.out.println(result);
        System.out.println(result2);
    }
    public static double scaleValue(BigDecimal x){
        BigDecimal result = x.setScale(2 , RoundingMode.HALF_UP);
        return result.doubleValue();
    }
    public static BigDecimal reverseAndAround(BigDecimal num){
        BigDecimal reverse = num.negate();
        return reverse.setScale(1,RoundingMode.HALF_UP);
    }
}
