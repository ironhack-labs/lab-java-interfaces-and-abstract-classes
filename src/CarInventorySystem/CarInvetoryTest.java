package CarInventorySystem;

public class CarInvetoryTest {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("SERIAL1", "MAKE1", "M1", 1);
        UtilityVehicle suv = new UtilityVehicle("SERIAL2", "MAKE2", "M2", 2, true);
        Truck truck = new Truck("SERIAL3", "MAKE3", "M3", 3, 333);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
