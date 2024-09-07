import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("676.489");
        BigDecimal b = new BigDecimal("33.33");
        BigDecimal c = a.setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal d = b.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("a/b is " + c.divide(d, BigDecimal.ROUND_HALF_UP));


        BigDecimal n = new BigDecimal("8.97");
        BigDecimal z = n.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println("Negated value of n is " + z.negate());
    }

}