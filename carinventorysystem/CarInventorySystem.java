package carinventorysystem;

public class CarInventorySystem {
    public static void main(String[] args) {

        Car car1 = new Sedan("123456789", "Toyota", "Camry", 10000);
        Car car2 = new UtilityVehicle(true, "987654321", "Honda", "Civic", 20000);
        Car car3 = new Truck(100.0, "111111111", "Ford", "F-150", 30000);

        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
        System.out.println(car3.getInfo());

    }
}
