package bigdecimal.operations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double roundNumberHalfDownScale2(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double reverseSignAndRoundNumberScale1(BigDecimal number) {
        if (number.signum() == -1) {
            return number.abs().setScale(1, RoundingMode.HALF_UP).doubleValue();
        } else if (number.signum() == 1) {
            return number.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
        } else return 0;
    }
}
