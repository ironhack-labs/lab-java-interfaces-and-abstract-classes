package carinventory;

public class Main {

    public static void main(String[] args) {
        Sedan sedan = new Sedan("12345", "Toyota", "Camry", 10000);
        Truck truck = new Truck("67890", "Ford", "F150", 5000, 10000.0);
        UtilityVehicle utilityVehicle = new UtilityVehicle("54321", "Chevy", "Cruze", 20000, true);

        System.out.println(sedan.toString());
        System.out.println(truck.toString());
        System.out.println(utilityVehicle.toString());
    }
}
