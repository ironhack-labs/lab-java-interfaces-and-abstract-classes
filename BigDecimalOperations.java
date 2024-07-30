import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double reverseSignAndRoundToNearestTenth(BigDecimal number) {
        BigDecimal result = number.negate().setScale(1, RoundingMode.HALF_UP);
        return result.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("4.2545");
        BigDecimal number2 = new BigDecimal("1.2345");
        BigDecimal number3 = new BigDecimal("-45.67");

        System.out.println("Rounded to nearest hundredth: " + roundToNearestHundredth(number1));
        System.out.println("Reversed sign and rounded to nearest tenth: " + reverseSignAndRoundToNearestTenth(number2));
        System.out.println("Reversed sign and rounded to nearest tenth: " + reverseSignAndRoundToNearestTenth(number3));
    }
}
