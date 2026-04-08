package CarInventorySystem;

import java.util.ArrayList;
import java.util.List;

public class AppCarInventorySystem {
    static void main(String[] args) {
        List<Car> cars = new ArrayList<>();


        cars.add(new Sedan("1425MXV", "Hyundai", "i30", 35000));
        cars.add(new UtilityVehicle("2323FFF", "Ford", "Kuga", 3000, false));
        cars.add(new Truck("1456GHH", "Chevrolet", "Silverado", 3200, 10000.0));
        cars.add(new UtilityVehicle("4589NGT", "Volkswagen", "Atlas", 14000, true));
        cars.add(new Truck("2555MGT", "Ford", "F-150", 4000, 10000.0));
        cars.add(new Sedan("3345GTX", "BMW", "M3", 1000));


        for (Car car : cars) {
            System.out.println(car.getInfo());
            System.out.println("<----------------------------------------------->");
        }



    }
}