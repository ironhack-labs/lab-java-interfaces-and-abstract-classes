package SystemInventoryCar;

public class Application {
    static void main(String[] args) {
        Car truck = new Truck("0007DWL", "Fiat", "Ducato", 180000, 3500.0);
        Car sedan = new Sedan("1415NMB", "Opel", "Insignia", 21000);
        Car utilityVehicle = new UtilityVehicle("6536MHN", "Toyota", "Hilux", 15000,true);


        System.out.println(truck.getInfo());
        System.out.println("******");
        System.out.println(sedan.getInfo());
        System.out.println("******");
        System.out.println(utilityVehicle.getInfo());
    }
}

