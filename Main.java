import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        // Create BigDecimalRounded
        BigDecimal input = new BigDecimal("4.2545");
        BigDecimal input2 = new BigDecimal(-33.4455);

        // Call BigDecimalRounded
        double roundedValue = BigDecimalOperations.BigDecimalRounded(input);
        System.out.println(roundedValue);

        // Call BigDecimalReversed
        BigDecimal reversedValue = BigDecimalOperations.BigDecimalReversed(input2);
        System.out.println("Reversed and rounded number: " + reversedValue);

        // Create vehicle objects
        Car sedan = new Sedan("223344556", "Lexus", "SC400", 50000);
        Car utilityVehicle = new UtilityVehicle("12345", "Ford", "F-150", 50000, true);
        Car truck = new Truck("22322333", "GMC", "Sierra", 123000,  2500);

        // Call getInfo
        String carDetails = sedan.getInfo();
        System.out.println(carDetails);
        String utilityVehicleDetails = utilityVehicle.getInfo();
        System.out.println(utilityVehicleDetails);
        String truckDetails = truck.getInfo();
        System.out.println(truckDetails);

        // Create video objects
        Video video1 = new Movie("Hey You", 90, 45);
        Video tvSeries = new TvSeries("Lost", 60, 50);

        // Call getMovieInfo
        String movie = video1.getMovieInfo();
        System.out.println(movie);
        String series = tvSeries.getMovieInfo();
        System.out.println(series);

        // Create an instance of IntArrayList
        IIntList intList = new IntArrayList();

        // Add numbers to the intList
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        intList.add(11);

        // Get and print elements from intList
        System.out.println(intList.get(0));
        System.out.println(intList.get(1));
        System.out.println(intList.get(2));
        System.out.println(intList.get(3));
        System.out.println(intList.get(4));
        System.out.println(intList.get(5));
        System.out.println(intList.get(6));
        System.out.println(intList.get(7));
        System.out.println(intList.get(8));
        System.out.println(intList.get(9));
        System.out.println(intList.get(14));

        // Create an instance of IntVector
        IIntList intVector = new IntVector();

        // Get and print elements from intVector
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);
        intVector.add(1);


        // Get and print elements from intVector
        System.out.println(intVector.get(20));


    }
}
