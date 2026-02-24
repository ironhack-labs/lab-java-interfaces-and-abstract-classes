package lab3.BigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task1 {
    public static void main(String[] args){
        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println(roundToTwoDigits(num1));
    }

    public static double roundToTwoDigits(BigDecimal value){
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
