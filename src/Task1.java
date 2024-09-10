

//BigDecimal Operations
//Using the BigDecimal documentation, create a method that accepts a BigDecimal and returns a double of the BigDecimal number rounded to the nearest
// hundredth. For example, 4.2545 should return 4.25.
//Using the BigDecimal documentation, create a method that accepts a BigDecimal, reverses the sign (if the parameter is positive,
// the result should be negative and vice versa), rounds the number to the nearest tenth and returns the result. For example,
// 1.2345 should return -1.2 and -45.67 should return 45.7.




public class Task1 {


    public static double roundToNearestHudnredth(BigDecimal number) {

        BigDecimal roundedValue = number.setScale(2, RoundingMode.HALF_UP);
        return roundedValue.doubleValue();
    }

    public static BigDecimal revSignAndRoundToNearestTenth(BigDecimal number) {

        BigDecimal reversed = number.negate();
        return reversed.setScale(1,RoundingMode.HALF_UP);

    }


    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal num3 = new BigDecimal("-45.67");

        System.out.println("Rounded to nearest hundreth : " +roundToNearestHudnredth(num1));
        System.out.println("Reversed and rounded to nearest tenth: " + revSignAndRoundToNearestTenth(num2));
        System.out.println("Reversed and rounded to nearest tenth: " + revSignAndRoundToNearestTenth(num3));

    }
}