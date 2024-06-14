import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        Sedan bmwi3 = new Sedan("154354","bwm", "i3",0);
        Truck f150 = new Truck("68550", "ford", "f150", 48500, 10000);
        UtilityVehicle gladiator = new UtilityVehicle("899653","Jeep", "Gladiator",0,true);

        System.out.println(bmwi3.getMake());
        System.out.println(f150.getTowingCapacity());
        System.out.println(gladiator.getMileage());


        BigDecimal bd1 = new BigDecimal("2.3042");
        BigDecimal bd2 = new BigDecimal("-3.2342");
        double roundedValue = roundToHundreth(bd1);
//        System.out.println(roundedValue);

        double negativeNum = signFlip(bd1);
        System.out.println(negativeNum);
        double positiveNum = signFlip(bd2);
        System.out.println(positiveNum);
    }
    public static double roundToHundreth(BigDecimal number){
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);

        return roundedNumber.doubleValue();
    }
    public static double signFlip(BigDecimal num) {
        if (num.doubleValue() > 0) {
            BigDecimal numFlipped = num.negate();
            return numFlipped.doubleValue();
        } else if (num.doubleValue() < 0) {
            BigDecimal positiveResult = num.abs();
            return positiveResult.doubleValue();
        }else {
            return 0.0;
        }

        

    }



}

