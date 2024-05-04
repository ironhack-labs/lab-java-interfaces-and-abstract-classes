package Task1;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class Task1 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("4.2545");
        BigDecimal displayVal = a.setScale(2, RoundingMode.HALF_UP); //should return 4.25
        System.out.println(displayVal);


        BigDecimal b = new BigDecimal("1.2345");
        BigDecimal sign = b.multiply(BigDecimal.valueOf(-1));
        BigDecimal signChangeToMinus = sign.setScale(1,RoundingMode.HALF_UP);
        System.out.println(signChangeToMinus);

        BigDecimal c = new BigDecimal("-45.67");
        BigDecimal sign2 = c.multiply(BigDecimal.valueOf(-1));
        BigDecimal signChangeToPlus = sign2.setScale(1, RoundingMode.HALF_UP);
        System.out.println(signChangeToPlus);
    }
}
