package org.example;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public double roundedToTheNearestHundredth(BigDecimal number){
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
        double doubleValue = roundedNumber.doubleValue();
        return doubleValue;
    }
    public double reverseTheSignAndRoundNearestTenth(BigDecimal number){
        BigDecimal roundedNumber = number.setScale(1, RoundingMode.HALF_UP);
        double doubleValue = -roundedNumber.doubleValue();
        return doubleValue;
    }


}
