package Task2;

public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("111", "Toyota", "Camry", 50000);
        UtilityVehicle uv = new UtilityVehicle("222", "Jeep", "Wrangler", 30000, true);
        Truck truck = new Truck("333", "Ford", "F-150", 70000, 10000.5);

        System.out.println(sedan.getInfo());
        sedan.startEngine();
        sedan.drive(100);

        System.out.println();

        System.out.println(uv.getInfo());
        uv.startEngine();
        uv.drive(200);

        System.out.println();

        System.out.println(truck.getInfo());
        truck.startEngine();
        truck.drive(300);
    }
}