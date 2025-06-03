

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal num3 = new BigDecimal("-45.67");

        // Prueba del método 1
        double rounded = BigDecimalOperations.roundToHundredth(num1);
        System.out.println("4.2545 → " + rounded); // Esperado: 4.25

        // Prueba del método 2
        BigDecimal reversed1 = BigDecimalOperations.reverseSignAndRoundToTenth(num2);
        System.out.println("1.2345 → " + reversed1); // Esperado: -1.2

        BigDecimal reversed2 = BigDecimalOperations.reverseSignAndRoundToTenth(num3);
        System.out.println("-45.67 → " + reversed2); // Esperado: 45.7
    }
}