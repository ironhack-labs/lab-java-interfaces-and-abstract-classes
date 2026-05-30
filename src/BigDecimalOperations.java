import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public double roundingToHundredth(BigDecimal number) {
        BigDecimal result = number.setScale(2, RoundingMode.HALF_UP);
        return result.doubleValue();
    }

    public BigDecimal reverseAndRound(BigDecimal number) {
        BigDecimal result = number.negate();
        result = result.setScale(1, RoundingMode.HALF_UP);
        return result;
    }
}