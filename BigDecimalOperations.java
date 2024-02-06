import java.math.BigDecimal;

/**
 * BigDecimal Operations
 * Using the BigDecimal documentation, create a method that accepts a BigDecimal and returns a double of the BigDecimal
 * number rounded to the nearest hundredth. For example, 4.2545 should return 4.25.
 * Using the BigDecimal documentation, create a method that accepts a BigDecimal, reverses the sign (if the parameter
 * is positive, the result should be negative and vice versa), rounds the number to the nearest tenth and returns
 * the result. For example, 1.2345 should return -1.2 and -45.67 should return 45.7.
 */

public class BigDecimalOperations {

    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal(4.2545 );
        BigDecimal bd2 = new BigDecimal(6.3555 );

        double nh1 = nearestHundredth(bd1);
        double nh2 = nearestHundredth(bd2);


        //------- Mini Test point 1 -----------
        if (nh1 == 4.25 && nh2 == 6.36){
            System.out.println("Test Passed!! :) the nearest hundredth of 4.2545 is: " + nh1);
            System.out.println("Test Passed!! :) the nearest hundredth of 6.3555 is: " + nh2);
        }

        bd1 = new BigDecimal(1.2345);
        bd2 = new BigDecimal (-45.67);

        nh1 = nearestTenthOppositeSign(bd1);
        nh2 = nearestTenthOppositeSign(bd2);


        //------- Mini Test point 2 -----------
        if (nh1 == -1.2 && nh2 == 45.7){
            System.out.println("Test Passed!! :) the hundredth tenth reverses sign of 1.2345 is: " + nh1);
            System.out.println("Test Passed!! :) the hundredth tenth reverses sign of -45.67 is: " + nh2);
        }
    }

    private static double nearestHundredth(BigDecimal bd){

        BigDecimal rounded = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return rounded.doubleValue();
    }
    private static double nearestTenthOppositeSign(BigDecimal bd){

        BigDecimal rounded = bd.setScale(1, BigDecimal.ROUND_HALF_UP);
        return rounded.doubleValue()*-1;
    }

}


