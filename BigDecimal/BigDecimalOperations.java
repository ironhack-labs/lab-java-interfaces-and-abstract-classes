package BigDecimal;

import java.math.BigDecimal;

/**
 * BigDecimal Operations
 * Using the BigDecimal documentation, create a method that accepts a BigDecimal and returns a double of the BigDecimal
 * number rounded to the nearest hundredth. For example, 4.2545 should return 4.25.
 * Using the BigDecimal documentation, create a method that accepts a BigDecimal, reverses the sign (if the parameter
 * is positive, the result should be negative and vice versa), rounds the number to the nearest tenth and returns
 * the result. For example, 1.2345 should return -1.2 and -45.67 should return 45.7.
 */

public class BigDecimalOperations {


    static double convertToDouble(BigDecimal bd){

        BigDecimal rounded = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return rounded.doubleValue();
    }


    static BigDecimal convertToDoubleAndReverse(BigDecimal bd){

        BigDecimal roundedReverse = bd.setScale(1, BigDecimal.ROUND_HALF_UP).negate();
        return roundedReverse;
    }

}


