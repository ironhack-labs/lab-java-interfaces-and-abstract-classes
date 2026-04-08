package BigDecimalOperations;

import java.math.BigDecimal;

import static BigDecimalOperations.BigDecimalOperations.reverseSignAndRound;
import static BigDecimalOperations.BigDecimalOperations.roundToDouble;

public class BigDecimalOperationsApplication {

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("23.2323232323");
        BigDecimal number2 = new BigDecimal("32.3232323232");
        BigDecimal number3 = new BigDecimal("-32.323232323");

        System.out.println("TEST METHOD 1 ↪");
        System.out.println("NUMBER TO TEST ➡ " + number1 + "\nResult Method 1 (ROUNDED TO 2 DECIMALS) ➡ " + roundToDouble(number1));
        System.out.println("METHOD 1 TESTED ________________________⤴\n");
        System.out.println("\nTEST METHOD 2 ↪");
        System.out.println("NUMBER TO TEST ➡ " + number2 + "\nResult Method 2 (INVERTED SIGN TO NEGATIVE) ➡ " + reverseSignAndRound(number2));
        System.out.println("METHOD 2 NEGATED NUMBER TESTED _____________⤴\n");
        System.out.println("NUMBER TO TEST ➡ " + number3 + "\nResult Method 2 (INVERTED SIGN TO POSITIVE) ➡ " + reverseSignAndRound(number3));
        System.out.println("METHOD 2 POSITIVE NUMBER TESTED ____________⤴");
    }

}
