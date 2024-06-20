package ArrayOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArrayOperations {

    // Task 1: Method to find the difference between the largest and smallest values
    public static int findDifference(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array length must be at least 1");
        }

        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }

    // Task 2: Method to find the smallest and second-smallest elements
    public static void findTwoSmallest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array length must be at least 2");
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }

        System.out.println("Smallest element: " + firstMin);
        System.out.println("Second smallest element: " + secondMin);
    }

    // Task 3: Method to calculate the result of the mathematical expression
    public static double calculateExpression(double x, double y) {
        return (x + y) / (x - y);
    }

    // BigDecimal Operation 1: Rounding BigDecimal to the nearest hundredth
    public static double roundToNearestHundredth(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    // BigDecimal Operation 2: Reversing the sign and rounding to the nearest tenth
    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number) {
        BigDecimal reversed = number.negate();
        return reversed.setScale(1, RoundingMode.HALF_UP);
    }
}
