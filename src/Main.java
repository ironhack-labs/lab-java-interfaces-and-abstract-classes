import com.IntList.IntArrayList;
import com.IntList.IntList;
import com.IntList.IntVector;
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
        UtilityVehicle excavator = new UtilityVehicle("0987654321", "John Deere", "56-rfs", 500000);
        excavator.setFourWheelDrive(true);
        System.out.println(excavator.getInfo());

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

    public static double rounded(BigDecimal x){
        return x.setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }

    public static BigDecimal invertNumber(BigDecimal x){
        return x.setScale(1, RoundingMode.HALF_UP).negate();
    }
}
