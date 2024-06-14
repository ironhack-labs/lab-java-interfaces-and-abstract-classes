package decimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("4.45678");
        double result = bigDecimal(number);
        System.out.println("this is the result: "+ result);

        BigDecimal num1 = new BigDecimal("2.45678");
        BigDecimal num2 = new BigDecimal("-23.5432");

        System.out.println("Reverse and rounded num1: "+ reverseAndRound(num1) );
        System.out.println("Reverse and rounded num2: "+ reverseAndRound(num2) );

    }

    public static double bigDecimal(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    public static BigDecimal reverseAndRound(BigDecimal number) {
        BigDecimal reversed = number.negate();
        return reversed.setScale(1, RoundingMode.HALF_UP);
    }

}
