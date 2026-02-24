package lab3.BigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task2 {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("1.2345");
        reverseToOneDigit(value);
    }

    public static void reverseToOneDigit(BigDecimal value){
       System.out.println(value.negate().setScale(1, RoundingMode.HALF_UP));
    }

}
