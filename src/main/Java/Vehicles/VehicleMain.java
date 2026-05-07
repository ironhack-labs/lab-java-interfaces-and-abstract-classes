package Java.Vehicles;

public class VehicleMain {

    public static void main(String[] args) {

        Sedan sedan = new Sedan("VIN012", "Toyota", "Camry", 50000);

        UtilityVehicle suv = new UtilityVehicle(
                "VIN123",
                "Jeep",
                "Wrangler",
                30000,
                true
        );

        Truck truck = new Truck(
                "VIN234",
                "Ford",
                "F-150",
                40000,
                12000.5
        );

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
