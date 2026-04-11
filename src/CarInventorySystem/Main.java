package CarInventorySystem;

public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("8902MLH", "Kia", "Xceed", 50000);

        UtilityVehicle suv = new UtilityVehicle("8793MYT", "Jeep", "Wrangler", 30000, true);

        Truck truck = new Truck("8795LFM", "Volvo", "FH", 70000, 5000.5);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
