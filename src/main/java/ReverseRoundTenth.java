import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReverseRoundTenth{

public static double reverseRoundToTenth(BigDecimal value) {
    BigDecimal reversed = value.signum() == 1 ? value.negate() : value;
    BigDecimal scaled = reversed.setScale(1, RoundingMode.HALF_UP);
    return scaled.doubleValue();
}

public static void main(String[] args) {
    BigDecimal input1 = new BigDecimal("7.5673");
    double result1 = reverseRoundToTenth(input1);
    System.out.println(input1 + " >----> " + result1);
   }
}

