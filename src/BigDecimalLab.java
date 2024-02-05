import java.math.RoundingMode;
import java.math.BigDecimal;

public class BigDecimalLab {

    public static double roundToNearestHundredth(BigDecimal bigNum1) {
        // Set the scale to 2 (hundredths place) with rounding mode
        bigNum1 = bigNum1.setScale(2, RoundingMode.HALF_UP);

        // Convert the rounded BigDecimal to a double
        return bigNum1.doubleValue();
    }

    /////////////////////////////

    public static double reverseRoundToNearestTenth(BigDecimal bigNum){
        bigNum = bigNum.setScale(1, RoundingMode.HALF_UP).negate();

        return bigNum.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal inputNumber = new BigDecimal("4.2545");

        double result = roundToNearestHundredth(inputNumber);
        System.out.println(result); // Output: 4.25

        BigDecimal inputNumber2 = new BigDecimal("-94.2545");

        double result2 = reverseRoundToNearestTenth(inputNumber2);
        System.out.println(result2); // Output: 94.3
    }
}