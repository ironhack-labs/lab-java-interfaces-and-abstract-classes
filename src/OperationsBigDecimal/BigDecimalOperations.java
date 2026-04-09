package OperationsBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {


    public static double redondearCentesima(BigDecimal numero) {
        return numero.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }


    public static BigDecimal invertirYRedondear(BigDecimal numero) {
        return numero.negate().setScale(1, RoundingMode.HALF_UP);
    }
}