package bigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NegativeRounder {

    public static double  reverseAndRoundToNearest(BigDecimal input){
        BigDecimal reversedValue = input.negate();
        BigDecimal roundedValue =  reversedValue.setScale(1,RoundingMode.HALF_EVEN);
        return roundedValue.doubleValue();
    }
    public static void main(String[] args){
        BigDecimal input1 = new BigDecimal("1.2545");
        double roundedResult1 = reverseAndRoundToNearest(input1);
        System.out.println("Original BigDecimal number " + input1);
        System.out.println("Reversed and Rounded " + roundedResult1);

        BigDecimal input2 = new BigDecimal("-45.67");
        double roundedResult2 = reverseAndRoundToNearest(input2);
        System.out.println("Original BigDecimal number " + input2);
        System.out.println("Reversed and Rounded " + roundedResult2);
    }
}
