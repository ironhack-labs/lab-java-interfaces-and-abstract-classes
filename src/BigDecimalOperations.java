import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal num3 = new BigDecimal("-45.67");

        System.out.println(roundToNearestHundredth(num1));
        System.out.println(reverseSignAndRound(num2));
        System.out.println(reverseSignAndRound(num3));
    }
    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }


    public static double reverseSignAndRound(BigDecimal number) {
        BigDecimal result = number.negate().setScale(1, RoundingMode.HALF_UP);
        return result.doubleValue();
    }
}