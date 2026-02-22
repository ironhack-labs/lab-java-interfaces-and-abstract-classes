package Decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;



class  DecimalOperations {
    void main() {
        System.out.println(rounding(new BigDecimal("55.55")));
        System.out.println(negate(new BigDecimal("66.33")));

    }

    public double rounding(BigDecimal value) {
        return value.setScale(2 , RoundingMode.UP).doubleValue();
    }

    public BigDecimal negate(BigDecimal value) {
        return value.negate().setScale(1 , RoundingMode.UP);
    }
}
