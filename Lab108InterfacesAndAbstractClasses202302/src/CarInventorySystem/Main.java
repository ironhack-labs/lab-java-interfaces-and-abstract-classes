package CarInventorySystem;

public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("1HGCM82633A123456", "Toyota", "Camry", 25000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("2FMHK6DT4EBD12345", "Ford", "Explorer", 18000, true);
        Truck truck = new Truck("3C7WRNFL1JG123456", "RAM", "3500", 40000, 7000);

        System.out.println("Sedan: " + sedan);
        System.out.println("Utility Vehicle: " + utilityVehicle);
        System.out.println("Truck " + truck);


    }
}
