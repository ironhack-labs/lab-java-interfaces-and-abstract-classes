
//i
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main{
    public static void main(String[] args) {

        BigDecimal bigDecimal2 = new BigDecimal("5.34657");

        System.out.println(bigDecimal2.setScale(2, RoundingMode.HALF_UP));

    }
}


