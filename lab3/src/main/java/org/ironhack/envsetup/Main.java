import org.ironhack.envsetup.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("Rounded: " +
                BigDecimalUtils.roundToHundredth(num1));

        BigDecimal num2 = new BigDecimal("1.2345");
        System.out.println("Reversed & Rounded: " +
                BigDecimalUtils.reverseAndRound(num2));


        Car sedan = new Sedan("123ABC", "Toyota", "Camry", 50000);
        Car truck = new Truck("456DEF", "Ford", "F150", 80000, 12000);
        Car suv = new UtilityVehicle("789GHI", "BMW", "X5", 40000, true);

        System.out.println(sedan.getInfo());
        System.out.println(truck.getInfo());
        System.out.println(suv.getInfo());



        Video movie = new Movie("Inception", 148, 8.8);
        Video series = new TvSeries("Friends", 25, 236);

        System.out.println(movie.getInfo());
        System.out.println(series.getInfo());



        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        list1.add(10);
        list1.add(20);

        list2.add(100);
        list2.add(200);

        System.out.println("ArrayList get: " + list1.get(0));
        System.out.println("Vector get: " + list2.get(1));
    }
}