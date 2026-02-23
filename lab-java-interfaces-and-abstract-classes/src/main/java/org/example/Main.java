package org.example;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimalOperations operations = new BigDecimalOperations();
        BigDecimal number = new BigDecimal(34.4564);
        double result1 = operations.roundedToTheNearestHundredth(number);
        double result2 = operations.reverseTheSignAndRoundNearestTenth(number);

        System.out.println("Rounded to the nearest hundredth: " + result1 + "\nReverse the sign and rounded to nearest tenth: " + result2);

        Truck truck = new Truck("VIN123321123213231", "Truck make", "Truck model", 323232,500);
        Sedan sedan = new Sedan("VIN123346656476761", "Sedan make", "Sedan model", 23122);
        UtilityVehicle utilityVehicle = new UtilityVehicle("VIN1324343346656476761", "Utility Vehicle make", "Utility Vehicle model", 2000, true);

        System.out.println("\n" + truck.getInfo());
        System.out.println("\n" + sedan.getInfo());
        System.out.println("\n" + utilityVehicle.getInfo());

        TvSeries tvSeries = new TvSeries("Game of Thrones", 54, 64 );
        Movie movie = new Movie("Lord of the Rings",378,4.94);

        System.out.println("\n" + tvSeries.getInfo());
        System.out.println("\n" + movie.getInfo());



    }
}