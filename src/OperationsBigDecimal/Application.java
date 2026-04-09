import OperationsBigDecimal.BigDecimalOperations;

import java.math.BigDecimal;


    public static void main(String[] args) {

        System.out.println("--- TESTS BIGDECIMAL ---");

        BigDecimal num1 = new BigDecimal("5.2565");
        System.out.println("Test1: " + BigDecimalOperations.redondearCentesima(num1));

        BigDecimal num2 = new BigDecimal("2.3545");
        System.out.println("Test2_negative: " + BigDecimalOperations.invertirYRedondear(num2));

        BigDecimal num3 = new BigDecimal("-54.7678");
        System.out.println("Test2_positive: " + BigDecimalOperations.invertirYRedondear(num3));
    }
