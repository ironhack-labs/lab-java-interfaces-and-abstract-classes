import BigDecimal.BigDecimalOperations;
import CarInventory.*;
import Videostreaming.*;
import Intlist.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BigDecimal Operations ===");
        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal num3 = new BigDecimal("-45.67");

        System.out.println("Round to hundredth: " + BigDecimalOperations.roundToHundredth(num1));
        System.out.println("Reverse sign and round: " + BigDecimalOperations.reverseSignAndRound(num2));
        System.out.println("Reverse sign and round: " + BigDecimalOperations.reverseSignAndRound(num3));

        System.out.println("\n=== Car Inventory ===");
        Car sedan = new Sedan("1ABC234", "Toyota", "Camry", 120000);
        Car suv = new UtilityVehicle("2DEF345", "Jeep", "Cherokee", 80000, true);
        Car truck = new Truck("3GHI456", "Ford", "F-150", 90000, 5000.0);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());

        System.out.println("\n=== Video Streaming ===");
        Video series = new TvSeries("Stranger Things", 400, 34);
        Video movie = new Movie("Inception", 148, 8.8);

        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());

        System.out.println("\n=== IntList Example ===");
        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        for (int i = 0; i < 12; i++) {
            list1.add(i);
        }

        for (int i = 0; i < 25; i++) {
            list2.add(i * 2);
        }

        System.out.println("IntArrayList[5]: " + list1.get(5));
        System.out.println("IntVector[10]: " + list2.get(10));
    }
}