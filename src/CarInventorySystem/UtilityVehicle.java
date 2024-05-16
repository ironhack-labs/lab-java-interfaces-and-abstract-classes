package CarInventorySystem;

public class UtilityVehicle extends Car {

    public UtilityVehicle(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public void start() {
        System.out.println("Utility Vehicle Started");
    }
}

