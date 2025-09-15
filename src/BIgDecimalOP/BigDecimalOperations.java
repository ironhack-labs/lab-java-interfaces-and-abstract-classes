package BIgDecimalOP;

import java.math.BigDecimal;
import java.math.RoundingMode;


    public class BigDecimalOperations {
        public static double roundToHundredth(BigDecimal number) {
            BigDecimal round = number.setScale(2, RoundingMode.HALF_UP);
            double roundNumber = round.doubleValue();
            return roundNumber;
        }

        public static void main(String[] args) {
            BigDecimal numbers= new BigDecimal("4.354056");
            double result = roundToHundredth(numbers);
            System.out.println("Number is: " + result);

        }
    }