package Task2;

public class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileAge) {
        super(vinNumber, make, model, mileAge);
    }

    @Override
    public String getInfo() {
        return "VIN Number: " + getVinNumber() + ", " +
        "Make: " + getMake() + ", " +
                "Model: " + getModel() + ", " +
                "Mileage: " + getMileAge();
    }
    }



