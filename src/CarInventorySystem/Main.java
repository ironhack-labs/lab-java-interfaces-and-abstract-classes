package CarInventorySystem;

public class Main {
    public static void main(String[] args) {
        // Test Car Class
        Car car = new Sedan("1234", "XP", 444);
        System.out.println(car.getInfo());

        // Test Truck Class
        Car truck = new Truck("1234", "XP", 444, 9999.12);
        System.out.println(truck.getInfo());

        // Test Truck Class
        UtilityVehicle utilityVehicle = new UtilityVehicle("1234", "XP", 444, true);
        System.out.println(utilityVehicle.getInfo());


    }
}
