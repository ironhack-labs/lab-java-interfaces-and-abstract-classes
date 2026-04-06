package Task1;

public class Main {
    public static void main(String[] args) {
        java.math.BigDecimal num1 = new java.math.BigDecimal("4.2545");
        java.math.BigDecimal num2 = new java.math.BigDecimal("1.2345");
        java.math.BigDecimal num3 = new java.math.BigDecimal("-45.67");

        System.out.println(BigDecimal.roundToHundredth(num1));
        System.out.println(BigDecimal.reverseSignAndRoundToTenth(num2));
        System.out.println(BigDecimal.reverseSignAndRoundToTenth(num3));
    }
}