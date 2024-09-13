package bigdecimals;

import java.math.BigDecimal;
public class BDOperations {

    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("565678.64531297");
        double firstAction = doubleOfBigDecimal(a);


        BigDecimal b = new BigDecimal(-3457.883247);
        BigDecimal c = new BigDecimal(735.3388734);
        BigDecimal secondAction = reverseAndRound(c);

        System.out.println(secondAction);
    }

    //Using the BigDecimal documentation, create a method that accepts a BigDecimal and returns a double of the BigDecimal number
    // rounded to the nearest hundredth. For example, 4.2545 should return 4.25.
    public static double doubleOfBigDecimal(BigDecimal inputOne) {
        BigDecimal rounded = inputOne.setScale(2, BigDecimal.ROUND_HALF_UP);
        double converted = rounded.doubleValue();
        return converted;
    }

    // Using the BigDecimal documentation, create a method that accepts a BigDecimal, reverses the sign (if the parameter is positive,
    // the result should be negative and vice versa), rounds the number to the nearest tenth and returns the result. For example,
    // 1.2345 should return -1.2 and -45.67 should return 45.7.

    public static BigDecimal reverseAndRound(BigDecimal inputTwo) {
        BigDecimal rounded = inputTwo.setScale(1, BigDecimal.ROUND_HALF_UP);
        BigDecimal reversed  = rounded.multiply(BigDecimal.valueOf(-1));
        return reversed;
    }

    }


