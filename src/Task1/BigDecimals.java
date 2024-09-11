package Task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimals {

    public static double round(BigDecimal value) {
        BigDecimal rounded = value.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    public static BigDecimal reverse (BigDecimal value1){
      BigDecimal reverseV= value1.negate().setScale(2, RoundingMode.HALF_UP);
      return reverseV;
    }

    public static void main(String[] args) {

        //       Task 1.1
        BigDecimal num = new BigDecimal("2.5623");
        double result = round(num);
        System.out.println(result);

        // Task 1.2

        BigDecimal num1=new BigDecimal("6356.23");
        BigDecimal num2=new BigDecimal("-3256.56");

        BigDecimal reversedNum1=reverse(num1);
        BigDecimal reversedNum2=reverse(num2);

        System.out.println("""
                The reversed and rounded: """+reversedNum1 +" " +reversedNum2);



    }
}
