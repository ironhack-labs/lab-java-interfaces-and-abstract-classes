import java.math.BigDecimal;
import java.math.RoundingMode;

class BigDecimalRounder {

    public static double roundToNearestHundredth(BigDecimal number) {
        // Setting the scale to 2 and rounding mode to HALF_UP
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
        // Converting BigDecimal to double
        return roundedNumber.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("6.453");
        double rounded = roundToNearestHundredth(number);
        System.out.println("Rounded value: " + rounded);
    }
}

public class Main {
    public static void main(String[] args) {
        Sedan sedan = Sedan;newSedan("8HG47465722626H22", "BMW", "320i", 108760);
        UtilityVehicle suv = new UtilityVehicle("4RG475859312345", "Ford", "Raptor", 57000, true);
        Truck truck = new Truck("1GTFC3233733872445", "Ram", "Bronco", 83500, 12000.5);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
