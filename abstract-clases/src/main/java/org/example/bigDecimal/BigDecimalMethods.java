package org.example.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMethods {
    public double bigDecimalToDouble(BigDecimal numero){
        BigDecimal result = numero.setScale(2,RoundingMode.HALF_UP);
        return result.doubleValue();
    }

    public BigDecimal bigDecimalToReverse(BigDecimal numero){
        BigDecimal result = numero.negate();
        return result.setScale(1,RoundingMode.HALF_UP);
    }
}