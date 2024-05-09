package BigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double returnHundredthDouble(BigDecimal bigDecimal) {

        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();

    }

    public static BigDecimal returnTenthNegate(BigDecimal bigDecimal) {

        return bigDecimal.setScale(1, RoundingMode.HALF_UP).negate();

    }

}
