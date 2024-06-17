import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtil {

    public static double roundToNearestHundredth(BigDecimal number) {
        // Set scale to 2 and round using HALF_UP rounding mode
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
        // Convert the BigDecimal to double
        return roundedNumber.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("4.2545");
        double rounded = roundToNearestHundredth(number);
        System.out.println("Rounded number: " + rounded);  // Output should be 4.25
    }
}
