import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args) {

        // Test convertToDouble function
        System.out.println(convertToDouble(new BigDecimal("1.2345")));
        System.out.println(convertToDouble(new BigDecimal("1.235")));
        System.out.println(convertToDouble(new BigDecimal("1.222")));

        // Test convertToDouble function
        System.out.println(reverseSignAndToDouble(new BigDecimal("1.2345")));
        System.out.println(reverseSignAndToDouble(new BigDecimal("1.235")));
        System.out.println(reverseSignAndToDouble(new BigDecimal("1.222")));

    }

    public static double convertToDouble(BigDecimal nb) {
        // Set scale to 2
        BigDecimal roundedNb = nb.setScale(2, RoundingMode.HALF_UP);

        // Return double conversion
        return roundedNb.doubleValue();
    }

    public static double reverseSignAndToDouble(BigDecimal nb) {
        // Reverse the sign
        BigDecimal reversedNb = nb.multiply(new BigDecimal("-1"));
        // Set scale to 2
        BigDecimal roundedAndReverseNb = reversedNb.setScale(2, RoundingMode.HALF_UP);

        // Return double conversion
        return roundedAndReverseNb.doubleValue();
    }
}
