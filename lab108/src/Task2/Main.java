package Task2;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("111X", "Honda", "v1", 20000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("222V", "Seat", "v2", 30000, true);
        Truck truck = new Truck("989Y", "Volvo", "v.3", 150000, 50);

        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());
    }
}
