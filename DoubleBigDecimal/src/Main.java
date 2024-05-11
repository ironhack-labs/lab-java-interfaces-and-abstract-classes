import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
//Using the BigDecimal documentation, create a method that accepts a BigDecimal and returns a double of the
// BigDecimal number rounded to the nearest hundredth. For example, 4.2545 should return 4.25.
        BigDecimal a = new BigDecimal("4.2545");
        BigDecimal displayVal = a.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Value: " + a);
        System.out.println("Rounded Value: " + displayVal);

        //Using the BigDecimal documentation, create a method that accepts a BigDecimal,
        // reverses the sign (if the parameter is positive, the result should be negative and vice versa),
        // rounds the number to the nearest tenth and returns the result.
        // For example, 1.2345 should return -1.2 and -45.67 should return 45.7.

        BigDecimal b = new BigDecimal("1.2345");
        BigDecimal displayVal2 = b.setScale(1, RoundingMode.HALF_UP);
        System.out.println("Value: " + b);
        System.out.println("Rounded Value: " + displayVal2);
        System.out.println("Negate Value: " + displayVal2.negate());

        BigDecimal c = new BigDecimal("-45.67");
        BigDecimal displayVal3 = c.setScale(1, RoundingMode.HALF_UP);
        System.out.println("Value: " + c);
        System.out.println("Rounded Value: " + displayVal3);
        System.out.println("Negate Value: " + displayVal3.negate());

    }
}