import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        //BigDEcimal operations:
        BigDecimal big1 = new BigDecimal("4.2545");
        System.out.println(roundBigdecimal(big1));
        BigDecimal big2 = new BigDecimal("1.2345");
        System.out.println(negateBigDecimal(big2));

    }

    public static double roundBigdecimal(BigDecimal bigDecimal){
        return bigDecimal.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    public static BigDecimal negateBigDecimal(BigDecimal bigDecimal){
        return bigDecimal.setScale(1, RoundingMode.HALF_EVEN).negate();
    }

}
