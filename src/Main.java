import com.InventoryCarSystem.Sedan;
import com.InventoryCarSystem.UtilityVehicle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("-45.67");
        System.out.println(rounded(number));
        System.out.println(invertNumber(number));

        Sedan car = new Sedan("1234567890", "Seat", "Ibiza", 125000);
        UtilityVehicle excavator = new UtilityVehicle("0987654321", "Jhon Deere", "56-rfs", 500000);
        excavator.setFourWheelDrive(true);
        System.out.println(excavator.getInfo());
    }

    public static double rounded(BigDecimal x){
        return x.setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }

    public static BigDecimal invertNumber(BigDecimal x){
        return x.setScale(1, RoundingMode.HALF_UP).negate();
    }
}
