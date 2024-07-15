import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDocumentation {

    public static BigDecimal reverseSignAndRoundToNearestTenth(BigDecimal number) {
        return number.negate().setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("1.2345");
        BigDecimal number2 = new BigDecimal("-45.67");
        System.out.println(reverseSignAndRoundToNearestTenth(number1));  // Output: -1.2
        System.out.println(reverseSignAndRoundToNearestTenth(number2));  // Output: 45.7
    }
}


