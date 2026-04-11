import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    static void main(String[] args){

        BigDecimal a = new BigDecimal("4.2545");
        double result = toRoundedDouble(a);

        System.out.println(result);

        BigDecimal b = new BigDecimal("1.2345");
        BigDecimal bMinus = reverseSign(b);

        System.out.println(bMinus);

        BigDecimal c = new BigDecimal("-45.67");
        BigDecimal cMinus = reverseSign(c);

        System.out.println(cMinus);
    }

    private static double toRoundedDouble(BigDecimal a) {
        return a.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private static BigDecimal reverseSign(BigDecimal b ){
        return b.setScale(1, RoundingMode.HALF_UP).negate();
    }


}
