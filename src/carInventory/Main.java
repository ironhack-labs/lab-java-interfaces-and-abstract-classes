package carInventory;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Sedan carSedan = new Sedan ("GLYPH", "Toyota", "Spacegroove", 100000);
        UtilityVehicle carUtility = new UtilityVehicle ("O0O0O", "Fiat", "Trashporter", 90990, true);
        Truck carTruck = new Truck ("TRUCK", "Cartruck", "Skinnyboi", 33333, 1.3);

        Car[] vehicles = {carSedan, carUtility, carTruck};

        for (Car vehicle : vehicles) {
            System.out.println(vehicle.getInfo());
        }

    }
}
