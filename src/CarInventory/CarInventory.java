package CarInventory;

public class CarInventory {
    public static void main(String[] args) {
        Car sedan = new Sedan("1ABC234", "Toyota", "Camry", 120000);
        Car suv = new UtilityVehicle("2DEF345", "Jeep", "Cherokee", 80000, true);
        Car truck = new Truck("3GHI456", "Ford", "F-150", 90000, 5000.0);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
