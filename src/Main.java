public class Main {
    public static void main(String[]args) {

        Sedan sedan = new Sedan("12345", "Toyota", "Camry",50000);
        System.out.println(sedan.getInfo());

        UtilityVehicle utilityVehicle = new UtilityVehicle("67890", "Jeep", "Wrangler",75000, true);
        System.out.println(utilityVehicle.getInfo());

        Truck truck = new Truck("54321", "Ford", "F-150", 100000, 800);
        System.out.println(truck.getInfo());

    }
}
