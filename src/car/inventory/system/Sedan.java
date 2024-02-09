package car.inventory.system;

public class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    String getInfo() {
        return String.format("Car: %n vinNumber = %s%n make = %s%n model = %s%n mileage = %s%n",
                super.getVinNumber(), super.getMake(), super.getModel(), super.getMileage());
    }

}
