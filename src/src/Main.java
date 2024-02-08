import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*// BigDecimal Operations
        BigDecimal bigDecimal1 = new BigDecimal(4.2545);
        System.out.println(bigDecimal1 + " rounded to the nearest hundredth = " + roundToHundredth(bigDecimal1));
        BigDecimal bigDecimal2 = new BigDecimal(1.2345);
        System.out.println(bigDecimal2 + " reversed and rounded to the nearest tenth = " + reverse(bigDecimal2));
        BigDecimal bigDecimal3 = new BigDecimal(-45.67);
        System.out.println(bigDecimal3 + " reversed and rounded to the nearest tenth = " + reverse(bigDecimal3));

        // Car Inventory System
        Sedan sedan = new Sedan("1234", "Make 1", "Model 1", 1000);
        System.out.println("Sedan Info = " + sedan.getInfo());
        UtilityVehicle utilityVehicle = new UtilityVehicle("2345", "Make 2", "Model 2", 2000, true);
        System.out.println("UtilityVehicle Info = " + utilityVehicle.getInfo());
        Truck truck = new Truck("5466", "Make 3", "Model 3", 3000, 2.5);
        System.out.println("Truck Info = " + truck.getInfo());

        // Video Streaming Service
        TvSeries tvSeries = new TvSeries("Friends", 30, 100);
        System.out.println("TV Series Info = " + tvSeries.getInfo());
        Movie movie = new Movie("Titanic", 120, 4.5);
        System.out.println("Movie Info = " + movie.getInfo());
*/
        // IntList Interface
        IntList intArrayListTest = new IntArrayList();
        intArrayListTest.add(10);
        System.out.println("Element at index 10: " + intArrayListTest.get(10));
        for (int i = 11; i < 16; i++) {
            intArrayListTest.add(i);
        }
        System.out.println("Element at index 15: " + intArrayListTest.get(15));

        IntList intVectorTest = new IntVector();
        intVectorTest.add(20);
        System.out.println("Element at index 20: " + intVectorTest.get(20));
        for (int i = 21; i < 26; i++) {
            intVectorTest.add(i);
        }
        System.out.println("Element at index 25: " + intVectorTest.get(25));
    }

    // Create a method that accepts a BigDecimal and returns a double of the BigDecimal number rounded to
    // the nearest hundredth. For example, 4.2545 should return 4.25.
    public static double roundToHundredth(BigDecimal bigDecimal) {
        return bigDecimal.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    // Create a method that accepts a BigDecimal, reverses the sign (if the parameter is positive, the
    // result should be negative and vice versa), rounds the number to the nearest tenth and returns the
    // result. For example, 1.2345 should return -1.2 and -45.67 should return 45.7.
    public static double reverse (BigDecimal bigDecimal) {
        return bigDecimal.setScale(1, RoundingMode.HALF_EVEN).doubleValue() * -1;
    }


}