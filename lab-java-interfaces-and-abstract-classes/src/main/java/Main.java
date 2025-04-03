import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    public static double roundHundreds(BigDecimal value) {

        if (value == null) {
            return 0.0;
        }
        BigDecimal roundedValue = value.setScale(2, BigDecimal.ROUND_HALF_UP);
        return roundedValue.doubleValue();
    }

    public static double roundTenthsInverse(BigDecimal value) {

        if (value == null) {
            return 0.0;
        }
        BigDecimal roundedValue = value.setScale(1, BigDecimal.ROUND_HALF_UP);
        roundedValue = roundedValue.multiply(new BigDecimal("-1"));
        return roundedValue.doubleValue();
    }
}
