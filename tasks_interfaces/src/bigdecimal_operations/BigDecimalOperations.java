package bigdecimal_operations;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double roundingMethod(BigDecimal number){
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double signReverse(BigDecimal number){
        return number.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}