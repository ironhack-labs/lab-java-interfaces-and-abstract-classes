import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass {
    public static double bigdecimal_operation(BigDecimal input_number){
        return  input_number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    public static BigDecimal bigdecimal_operation2 (BigDecimal input_number){
        return input_number.negate().setScale(1,RoundingMode.HALF_UP);
    }
}


