package CarInventorySystem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class biggestofdecimals {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(4.2545);
        BigDecimal b = new BigDecimal(1.2534);
        BigDecimal c = BigDecimal.valueOf(-4.56);
        BigDecimal sum = a.add(b);
        BigDecimal displayVal = sum.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(displayVal);
        // Positive to Negative and vice versa
        //to negative
        BigDecimal bigd1 = BigDecimal.valueOf(2.1234);
        BigDecimal negative = bigd1.negate();
        BigDecimal roundedbigd1 = negative.setScale(1,RoundingMode.HALF_EVEN);
        System.out.println(roundedbigd1);
        //to positive
        BigDecimal bigd2 = BigDecimal.valueOf(-23.5647);
        BigDecimal positive = bigd2.abs();
        BigDecimal roundedbigd2 = positive.setScale(1,RoundingMode.HALF_EVEN);
        System.out.println(roundedbigd2);
    }

}
