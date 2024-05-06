package CarInventorySystem;

public class CarsInventory extends Car {
    public CarsInventory(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    public static void main(String[] args) {
        Truck truck = new Truck("WBANS1235647", "Volkswagen", "Amarok", 60000);
        String info = truck.getInfo();
        Sedan sedan = new Sedan("WBANS1254752", "BMW", "M5Competition", 50);
        String info1 = sedan.getInfo();
        System.out.println(info);
        }

    }

