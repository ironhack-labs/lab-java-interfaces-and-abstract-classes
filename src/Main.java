import java.math.BigDecimal;
import java.math.RoundingMode;

import com.IntList.IntArrayList;
import com.IntList.IntList;
import com.IntList.IntVector;
import com.InventoryCarSystem.Sedan;
import com.InventoryCarSystem.UtilityVehicle;

public class Main {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("-45.67");
        System.out.println(roundToNearestHundredth(number));
        System.out.println(reverseSignAndRound(number));

        Sedan car = new Sedan("1234567890", "Fiat", "500", 125000);
        UtilityVehicle bulldozer = new UtilityVehicle("0987654321", "Caterpillar", "666-kd", 200000);
        bulldozer.setFourWheelDrive(false);
        System.out.println(bulldozer.getInfo());

        IntList list = new IntArrayList();
        for(int i = 0; i<=10; i++){
            list.add(i);
        }
        int elementReturned = list.get(2);
        list.add(11);
        int elementOfDynamicArray = list.get(11);
        System.out.println(elementOfDynamicArray);
        System.out.println(elementReturned);


        IntList vectorList = new IntVector();
        for(int i = 0; i <= 20; i ++){
            vectorList.add(i);
        }
        int vectorElementReturned = list.get(2);
        System.out.println(vectorElementReturned);
        vectorList.add(21);
        System.out.println(vectorList.get(21));
    }

    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseSignAndRound(BigDecimal number) {
        BigDecimal reversedNumber = number.negate();
        return reversedNumber.setScale(1, RoundingMode.HALF_UP);
    }
}
