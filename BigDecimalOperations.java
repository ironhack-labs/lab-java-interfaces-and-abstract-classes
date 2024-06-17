import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double roundToNearestHundredth(BigDecimal number){
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseSignAndRoundToNearestTenth(BigDecimal number){
        BigDecimal reversedNumber = number.negate();
        return reversedNumber.setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("4.2545");
        BigDecimal number2 = new BigDecimal("1.2345");
        BigDecimal number3 = new BigDecimal("-45.67");

        System.out.println("Rounded to nearest hundredth: " + roundToNearestHundredth(number1)); // 4.25
        System.out.println("Reversed sign and rounded to nearest tenth: " + reverseSignAndRoundToNearestTenth(number2)); // -1.2
        System.out.println("Reversed sign and rounded to nearest tenth: " + reverseSignAndRoundToNearestTenth(number3)); // 45.7
    }
}
