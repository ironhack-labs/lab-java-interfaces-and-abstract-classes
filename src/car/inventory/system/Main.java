package car.inventory.system;

public class Main {

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("9992", "Tesla", "1", 300);
        System.out.println(sedan1.getInfo());
        Sedan sedan2 = new Sedan("9991", "Tesla", "1", 300);
        System.out.println(sedan2.getInfo());

        UtilityVehicle utilityVehicle1 = new UtilityVehicle("9995", "tesla","3", 200, false);
        System.out.println(utilityVehicle1.getInfo());
        UtilityVehicle utilityVehicle2 = new UtilityVehicle("9996", "tesla","3", 200, true);
        System.out.println(utilityVehicle2.getInfo());

        Truck truck1 = new Truck("9993", "Tesla", "CyberTruck1", 500, 15.2);
        System.out.println(truck1.getInfo());
        Truck truck2 = new Truck("9994", "Tesla", "CyberTruck2", 500, 18.2);
        System.out.println(truck2.getInfo());
    }
}
