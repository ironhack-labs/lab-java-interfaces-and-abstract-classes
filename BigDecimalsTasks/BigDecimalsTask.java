package BigDecimalsTasks;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalsTask {
    public static void main(String[] args) {
        //Task1
        BigDecimal myNum = new BigDecimal("4.2545");
        BigDecimal roundMyNum = myNum.setScale(2, RoundingMode.HALF_UP);
        double doubleMyNum = roundMyNum.doubleValue();

        System.out.println("The BigDecimal: " + myNum);
        System.out.println("Converted to double: " + doubleMyNum);

        //Task2
        java.math.BigDecimal PositiveNumber;
        PositiveNumber = new BigDecimal("1.2345");
        BigDecimal roundedPN = PositiveNumber.setScale(1, RoundingMode.HALF_UP);
        System.out.println("Negative value is " + roundedPN.negate());

        java.math.BigDecimal NegativeNumber;
        NegativeNumber = new BigDecimal(-45.67);
        BigDecimal roundedNN = NegativeNumber.setScale(1, RoundingMode.HALF_UP);
        System.out.println("Positive value is " + roundedNN.negate());

    }
}
