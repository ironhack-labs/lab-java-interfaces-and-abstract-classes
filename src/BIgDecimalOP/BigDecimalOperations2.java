package BIgDecimalOP;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations2 {
    public static BigDecimal reverseNumber(BigDecimal num){
    BigDecimal changedNum= num.negate();
    BigDecimal numF = changedNum.setScale(1, RoundingMode.HALF_UP );
  return numF;
    }
     public static void main(String[] args) {
        BigDecimal numF = new BigDecimal("4.4628");
        BigDecimal result = reverseNumber(numF);
         System.out.println("Number is: " + result);
    }
}
