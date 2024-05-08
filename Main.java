import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        //===========================================================================================================//

        BigDecimalConverter converter = new BigDecimalConverter();

        // Create a BigDecimal from a double
        BigDecimal input = new BigDecimal("12.33333333333");

        // Convert the BigDecimal to another BigDecimal with rounding
        BigDecimal result = converter.roundingMode(input, 2, RoundingMode.HALF_UP);

        // Print the BigDecimal result
        System.out.println("Converted and Rounded BigDecimal: " + result);


        //===========================================================================================================//


        // Second input for revere sign positive negative

        BigDecimal secondInput = new BigDecimal("8.12");


        // call converter and covert pos to neg, and vice versa
        BigDecimal secondResult = converter.process(secondInput);

        // print it out
        System.out.println(secondResult);


        //===========================================================================================================//

        UtilityVehicle myUtility = new UtilityVehicle("MAN", "Man", 32, 323, true);

        Truck myTruck = new Truck("Ford", "F150", 2000, 932903, 9239320);

        Sedan mySedan = new Sedan("Volkswagen", "Passat", 390223, 2323);


        System.out.println(mySedan.getInfo());
        System.out.println(myTruck.getInfo());

        //===========================================================================================================//


        Movie movie = new Movie("Inception", 180, 9.5);
        movie.getInfo();


        TvSeries tvSeries = new TvSeries("Breaking Bad", 45, 33);
        tvSeries.getInfo();

        //===========================================================================================================//





    }
}