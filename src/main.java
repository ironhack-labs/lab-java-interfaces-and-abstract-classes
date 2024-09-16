import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.round;

public class main {

    public static void main(String[] args) {

        BigDecimal x = new BigDecimal("4.2545");
        System.out.println(doubleRoundedHundredth(x));

        BigDecimal y = new BigDecimal("1.2345");
        BigDecimal z = new BigDecimal("-45.67");
        System.out.println(reversedNumber(y));
        System.out.println(reversedNumber(z));

        Sedan carSedan = new Sedan("2222BDS", "Peugeot", "207", 20000);
        System.out.println(carSedan.getInfo());

        UtilityVehicle carUtility = new UtilityVehicle("6689LPS", "Land Rover", "Range Rover LIGHT version", 15000, false);
        UtilityVehicle carUtility2 = new UtilityVehicle("4994LPS", "Land Rover", "Range Rover Sport", 70000, true);
        System.out.println(carUtility.getInfo());
        System.out.println(carUtility2.getInfo());

        Truck carTruck = new Truck("9999LLS", "IVECO", "Super Truck 2000", 250, 25.66);
        System.out.println(carTruck.getInfo());

        TvSeries dark = new TvSeries("Dark", 60, 18);
        System.out.println(dark.getInfo());

        Movie inception = new Movie("Inception", 180, 98.9);
        System.out.println(inception.getInfo());

        Movie interstellar = new Movie("Interstellar", 190, 977);
        System.out.println(interstellar.getInfo());

        Movie tenet = new Movie("Tenet", 190, 9.15);
        System.out.println(tenet.getInfo());
    }

    public static double doubleRoundedHundredth (BigDecimal num) {
        num = num.setScale(2, RoundingMode.HALF_UP);
        return num.doubleValue();
    }

    public static BigDecimal reversedNumber (BigDecimal num2) {

        if (num2.compareTo(BigDecimal.ZERO) < 0) {
            return num2.abs().setScale(1, RoundingMode.HALF_UP);
        } else {
            return num2.negate().setScale(1, RoundingMode.HALF_UP);
        }

    }



}
