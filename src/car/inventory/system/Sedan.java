package car.inventory.system;

public class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);

    }

    @Override
    String getInfo() {
        return "Car: " + "\n" +
                "vinNumber='" + super.getVinNumber() + "\n" +
                "make='" + super.getMake() + "\n" +
                "model='" + super.getModel() + "\n" +
                "mileage=" + super.getMileage() + "\n";
    }

}
