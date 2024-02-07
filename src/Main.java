import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1) BigDecimal Operations
        System.out.println("\u001b[1m 1) BigDecimal Operations");
        BigDecimal testNum = new BigDecimal("4.2884554224");
        System.out.println("\u001b[0m Input BigDecimal = " + testNum);
        System.out.println("Output roundToHundredth method: " + roundToHundredth(testNum));
        System.out.println("Output negativeRounded method: " + negativeRounded(testNum));

        // 2) Car subclasses tests
        System.out.println("\u001b[1m \n2) Car Inventory System");
        UtilityVehicle car1 = new UtilityVehicle("vinNumber_uv", "Seat_uv", "Ibiza_uv", 20000, true);
        Sedan car2 = new Sedan("vinNumber_sedan", "Seat_sedan", "Ibiza_sedan", 10000);
        Truck car3 = new Truck("vinNumber_truck", "Seat_truck", "Ibiza_truck", 30000, 350000d);
        System.out.println("\u001b[0mCar 1 (utilityvehicle) - " + car1.getInfo());
        System.out.println("\nCar 2 (sedan) - " + car2.getInfo());
        System.out.println("\nCar 3 (truck) - " + car3.getInfo());


        // 3) Video streaming service tests
        System.out.println("\u001b[1m \n3) Video Streaming Service");
        TvSeries friends = new TvSeries("Friends", 236*22, 236);
        Movie se7en = new Movie("Se7en", 127, 9d);
        System.out.println("\u001b[0mTvSeries - " + friends.getInfo());
        System.out.println("\nMovie - " + se7en.getInfo());

        // 4) IntList Interface tests
        System.out.println("\u001b[1m \n4) IntList Interface");

        IntArrayList test1 = new IntArrayList();
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(3);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(5);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(6);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(9);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(0);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(1);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(5);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(6);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(10);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(2);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(5);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(1);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(5);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(6);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(2);
        System.out.println(Arrays.toString(test1.getArrayInts()));
        test1.add(11);
        System.out.println(Arrays.toString(test1.getArrayInts()));



        // IntVector
        IntVector test2 = new IntVector();

        test2.add(3);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(5);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(6);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(9);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(0);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(1);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(5);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(6);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(10);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(2);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(5);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(1);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(5);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(6);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(2);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(11);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(10);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(2);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(5);
        System.out.println(Arrays.toString(test2.getArrayInts()));
        test2.add(1);
        System.out.println(Arrays.toString(test2.getArrayInts()));

        test2.add(32456);
        System.out.println(Arrays.toString(test2.getArrayInts()));
    }


    // 1.1) Method returning a double value rounding a BigDecimal to the hundredth
    public static double roundToHundredth (BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    // 1.2) Method returning the opposite rounded number to the tenth of a BigDecimal
    public static BigDecimal negativeRounded (BigDecimal number) {
        BigDecimal negativeBigDecimal = new BigDecimal("-1");
        return negativeBigDecimal.multiply(number).setScale(1, RoundingMode.HALF_EVEN);
    }
}
