package bigDecimalOps;
import java.math.BigDecimal;
import java.math.RoundingMode;
// it told me BigDecimal.ROUND_HALF_UP has been deprecated,
// so I looked for the updated version with RoundingMode

public class BDNumber {
    BigDecimal number;

    public BDNumber(BigDecimal number) {
        this.number = number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public double toRoundedDouble () {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public BigDecimal toReversedRounded () {
        return number.setScale(1, RoundingMode.HALF_UP).negate(); // used multiply(new BigDecimal("-1") at first but saw this in the documentation.
    }

}


