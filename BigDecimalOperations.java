import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("4.2545");
        System.out.println(roundToNearestHundredth(number));  // Output: 4.25
    }
}


