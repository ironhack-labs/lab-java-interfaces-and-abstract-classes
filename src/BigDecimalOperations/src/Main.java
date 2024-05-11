import java.math.BigDecimal;
import java.math.*;
public class Main {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("-3.14159265358979323846");
        System.out.println(a);
        System.out.println(BigDecimalDouble(a));
        System.out.println(BigDecimalSign(a));

    }

    //Question 1
    public static double BigDecimalDouble(BigDecimal bd) {
        BigDecimal displayVal = bd.setScale(2, RoundingMode.HALF_EVEN);
        return displayVal.doubleValue();

    }

    //Question 2

    public static BigDecimal BigDecimalSign(BigDecimal bd) {
        bd = bd.negate();
        return bd.setScale(1, RoundingMode.HALF_EVEN);
    }


    }