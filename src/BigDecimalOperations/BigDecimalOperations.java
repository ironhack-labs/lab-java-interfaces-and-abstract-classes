package BigDecimalOperations;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    //METODO1⤵
    public static double roundToDouble(BigDecimal number){
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
        return roundedNumber.doubleValue();
    }
    //METODO2⤵
    public static BigDecimal reverseSignAndRound(BigDecimal number){
        BigDecimal negatedNumber = number.negate();
        return negatedNumber.setScale(1, RoundingMode.HALF_UP);
    }
}
