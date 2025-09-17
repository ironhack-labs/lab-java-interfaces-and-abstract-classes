package BigDecimalsUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtils {
    public static double roundToHundredth(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Input cant be null");
        }
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double reverseSignandRoundToTenth(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Input cant be null");
        }
        return value.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }


    public static void main(String[] args) {
        System.out.println(roundToHundredth(new BigDecimal("4.545454")));
        System.out.println(reverseSignandRoundToTenth(new BigDecimal("5.56565")));
        System.out.println(reverseSignandRoundToTenth(new BigDecimal("-2.434343356")));

    }
}