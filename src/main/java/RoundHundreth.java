
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundHundreth {
    public static double roundToNearestHundredth( BigDecimal value) {
        BigDecimal scaled = value.setScale(2, RoundingMode.HALF_UP);
        return scaled.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal input1 = new BigDecimal("2.7895");
        double result1 = roundToNearestHundredth(input1);
        System.out.println(input1 + " >----> " + result1);
        }
}
