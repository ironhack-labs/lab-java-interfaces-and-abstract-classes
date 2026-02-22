package org.example;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("4.2545");
        double b=RoundtoDouble(num1);
        System.out.println(b);
        double c=reversDouble(num1);
        System.out.println(c);
    }
    // BigDecimal Operation 1
    public static double RoundtoDouble(BigDecimal num){
        BigDecimal roundedUp = num.setScale(2, RoundingMode.HALF_UP);
        double result= roundedUp.doubleValue();
        return result;
    }

    //BigDecimal Operation 2
    public static double reversDouble(BigDecimal num){
        BigDecimal roundtoten =  num.setScale(1,RoundingMode.HALF_UP);
        double result = -roundtoten.doubleValue();
        return result;
    }

}
