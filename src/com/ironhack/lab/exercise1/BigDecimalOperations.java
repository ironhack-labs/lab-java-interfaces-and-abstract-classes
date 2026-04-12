package com.ironhack.lab.exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

     //Ejercicio 1 redondear un Bigdecimal y convertirlo en bouble
    public static double roundBigDecimalToDouble(BigDecimal number){
       BigDecimal roundToTwoDecimals = number.setScale(2, RoundingMode.HALF_UP);
        return roundToTwoDecimals.doubleValue();
    }

    //Ejercicio 2 Invertir signo y redondear  la decima más cercana
    public static  BigDecimal negateAndRound(BigDecimal number){
        BigDecimal invertedNumber = number.negate();
        return invertedNumber.setScale(1, RoundingMode.HALF_UP );
    }
}
