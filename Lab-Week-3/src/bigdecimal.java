import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigdecimal {
        public static void main(String[] args) {
            String a = "4.2545";
            String b = "1.2345";
            String c = "-45.67";

            BigDecimal myNumber = new BigDecimal(a);
            BigDecimal result = myNumber.setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("Value: " + myNumber + " Rounded Value: " + result + "\n");

            BigDecimal secondNumber = new BigDecimal(b);
            BigDecimal displayVal2 = secondNumber.setScale(1, RoundingMode.HALF_UP);
            System.out.println("Value: " + secondNumber + " Result: " + displayVal2.negate()+ "\n");


            BigDecimal thirdNumber = new BigDecimal(c);
            BigDecimal displayVal3 = thirdNumber.setScale(1, RoundingMode.HALF_UP);
            System.out.println("Value: " + thirdNumber  + " Result: " + displayVal3.negate());
        }
}
