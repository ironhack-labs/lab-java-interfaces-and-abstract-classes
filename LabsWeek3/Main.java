package LabsWeek3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        //Task 1 create a method that acceptsBigDecimal and returns a double of the
        //BigDecimal number rounded to the nearest hundredth
        BigDecimal a = new BigDecimal("4.2545");
        BigDecimal rounded = a.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(rounded.doubleValue());
        //Task :create a method that accepts a BigDeciaml, reverse the sign(-to+ and vice versa)
        //and it rounds the number to one decimal.
        System.out.println("==========");


        BigDecimal bd1 = BigDecimal.valueOf(1.2345);
        BigDecimal negative = bd1.negate();//-1.2345
        BigDecimal rbd1 = negative.setScale(1,RoundingMode.HALF_EVEN);//-1.2
        System.out.println(rbd1);//This method returns the negative value

        BigDecimal bd2 = BigDecimal.valueOf(-45.67);
        BigDecimal positive = bd2.abs();//45.67
        BigDecimal rbd2 = positive.setScale(1,RoundingMode.HALF_EVEN);//45.7
        System.out.println(rbd2);//This method returns the absolute value





    }


}

