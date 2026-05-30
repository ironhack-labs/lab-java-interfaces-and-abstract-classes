import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimalOperations operations = new BigDecimalOperations();

        BigDecimal number1 = new BigDecimal("4.2545");
        double result1 = operations.roundingToHundredth(number1);
        System.out.println(result1);

        BigDecimal number2 = new BigDecimal("1.2345");
        BigDecimal result2 = operations.reverseAndRound(number2);
        System.out.println(result2);

        BigDecimal number3 = new BigDecimal("-45.67");
        BigDecimal result3 = operations.reverseAndRound(number3);
        System.out.println(result3);

        Sedan sedan = new Sedan("VIN123", "Toyota", "Corolla", 50000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("VIN456", "Jeep", "Wrangler", 30000, true);
        Truck truck = new Truck("VIN789", "Ford", "F150", 70000, 3500);

        System.out.println(sedan.toString());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());

        TvSeries tvSeries = new TvSeries("Breaking Bad", 45, 62);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());

        IntList list1 = new IntArrayList();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        IntList list2 = new IntVector();

        list2.add(100);
        list2.add(200);
        list2.add(300);

        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));
    }
}