package Cars;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("VIN5656","Toyota", "Camry", 6700);
        Truck truck = new Truck("VIN1234", "Mercedes", "BigTruck",5600,3433);
        UtilityVehicle utilityvehicle = new UtilityVehicle("VIN9899","Ford", "F-150", 4500,true);

        System.out.println(sedan.getInfo());
        System.out.println(truck.getInfo());;
        System.out.println(utilityvehicle.getInfo());
    }
}
