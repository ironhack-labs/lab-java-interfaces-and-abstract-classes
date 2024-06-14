import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double BigDecimalRounded(BigDecimal number) {
        if (number == null) {
            throw new IllegalArgumentException("Cannot be Null");
        }
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();

    }
    public static BigDecimal BigDecimalReversed (BigDecimal number) {
        if (number == null) {
            throw new IllegalArgumentException("Cannot be Null");
        }

        return number.negate().setScale(1, RoundingMode.HALF_EVEN);




    }


}
