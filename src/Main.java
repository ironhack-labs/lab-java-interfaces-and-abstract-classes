import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        // BigDecimal Operations

        // a)
        BigDecimal num1 = new BigDecimal("4.2545");
        double doubleRoundNum = roundNum(num1);
        System.out.println(doubleRoundNum);

        // b)
        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal num3 = new BigDecimal("-45.67");
        BigDecimal invertNum1 = invertNum(num2);
        BigDecimal invertNum2 = invertNum(num3);
        System.out.println(invertNum1);
        System.out.println(invertNum2);
    }

    public static double roundNum(BigDecimal num) {
        return num.setScale(2, RoundingMode.HALF_EVEN)
                .doubleValue();
    }

    public static BigDecimal invertNum(BigDecimal num) {
        return num.setScale(1, RoundingMode.HALF_UP)
                .multiply(new BigDecimal(-1));
    }
}