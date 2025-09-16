package bigDecimalOps;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BDNumber number = new BDNumber(new BigDecimal("5.5423"));
        System.out.println("Your number is: " + number.getNumber());

        System.out.println("Rounded to 2 decimals and converted to double: " + number.toRoundedDouble());
        System.out.println("Reversed and rounded to 1 decimal: " + number.toReversedRounded());

    }
}
