package org.example;
import java.math.BigDecimal;

public class BigDecimalMath {

//    Exercise 1
//    Using the BigDecimal documentation,
//    create a method that accepts a BigDecimal and returns a double of the BigDecimal number rounded to the nearest hundredth.
//    For example, 4.2545 should return 4.25.
    public static double rounded(BigDecimal arg) {
        return arg.setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }

//    Exercise 2
//    Using the BigDecimal documentation, create a method that accepts a BigDecimal,
//    reverses the sign (if the parameter is positive, the result should be negative and vice versa),
//    rounds the number to the nearest tenth and returns the result. For example, 1.2345 should return -1.2 and -45.67 should return 45.7.

    public static double roundedReversed(BigDecimal bigDecimal) {
        return -bigDecimal.setScale(1, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }
}
