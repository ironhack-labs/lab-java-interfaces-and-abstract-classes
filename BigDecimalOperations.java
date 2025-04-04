import java.math.BigDecimal;

public class BigDecimalOperations {
    public static void main(String[] args) {

        System.out.println("========== BigDecimal Operations ==========");
        System.out.println("TASK 1:");
        System.out.println(doubleValue(new BigDecimal("4.2545")));
        System.out.println("TASK 2:");
        System.out.println("1.2345 -> " + reverseAndRound(new BigDecimal("1.2345")));
        System.out.println("-45.67 -> " + reverseAndRound(new BigDecimal("-45.67")));
    }

    public static double doubleValue(BigDecimal number) {
        return number.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static BigDecimal reverseAndRound(BigDecimal number) {
        return number.negate().setScale(1, BigDecimal.ROUND_HALF_UP);
    }
}
