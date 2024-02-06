package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalRounder {

    public static double roundToNearest(BigDecimal input){
        return input.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
    public static void main(String[] args){
        BigDecimal input = new BigDecimal("4.2545");
        double roundedResult = roundToNearest(input);
        System.out.println("Original BigDecimal number " + input);
        System.out.println("Rounded " + roundedResult);
    }
}
