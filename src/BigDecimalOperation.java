import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperation {
    public static double roundToNearestHundredth(BigDecimal number) {

        BigDecimal roundedValue = number.setScale(2, RoundingMode.HALF_UP);
        return roundedValue.doubleValue();
    }

    public static BigDecimal revSignAndRoundToNearestTenth(BigDecimal number) {

        BigDecimal reversed = number.negate();
        return reversed.setScale(1,RoundingMode.HALF_UP);

    }


    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal num2 = new BigDecimal("1.2355");
        BigDecimal num3 = new BigDecimal("-45.67");

        System.out.println("Rounded to nearest hundreth : " + roundToNearestHundredth(num1));
        System.out.println("Reversed and rounded to nearest tenth: " + revSignAndRoundToNearestTenth(num2));
        System.out.println("Reversed and rounded to nearest tenth: " + revSignAndRoundToNearestTenth(num3));

    }
}