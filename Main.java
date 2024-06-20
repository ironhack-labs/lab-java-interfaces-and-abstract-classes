package ArrayOperations;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Test for Task 1
        int[] array1 = {5, 2, 9, 1, 5, 6};
        System.out.println("Difference between largest and smallest: " + ArrayOperations.findDifference(array1));

        // Test for Task 2
        int[] array2 = {5, 2, 9, 1, 5, 6};
        ArrayOperations.findTwoSmallest(array2);

        // Test for Task 3
        double x = 5.0;
        double y = 2.0;
        System.out.println("Result of the expression: " + ArrayOperations.calculateExpression(x, y));

        // Test for BigDecimal Operations
        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("Rounded to nearest hundredth: " + ArrayOperations.roundToNearestHundredth(num1));

        BigDecimal num2 = new BigDecimal("1.2345");
        System.out.println("Reversed and rounded to nearest tenth: " + ArrayOperations.reverseSignAndRoundToTenth(num2));
    }
}