package Task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BDOperations {

    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal("-25.7852");
        BigDecimal bd2 = new BigDecimal("0");

        System.out.println(roundedDecimal(bd1));

        System.out.println(reversedDecimal(bd1));
    }

    public static double roundedDecimal(BigDecimal bd1) {
        return bd1.setScale(2, RoundingMode.HALF_UP).doubleValue();

    }

    public static double reversedDecimal(BigDecimal bd1) {
        return bd1.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

}