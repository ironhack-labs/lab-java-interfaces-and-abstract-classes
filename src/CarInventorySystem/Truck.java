package CarInventorySystem;

public class Truck extends Car {
    // Constructors
    Truck(String vinNumber, String model, int mileage, double towingCapacity){
        super(vinNumber, "Truck", model, mileage);
        setTowingCapacity(towingCapacity);
    }

    // Attributes
    private double towingCapacity;

    // Getters and Setters
    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    // Methods
    @Override
    public String getInfo() {
        return "{\n"
                + "\t" + "Vin Number: " + getVinNumber() + "\n"
                + "\t" + "Make: " + getMake() + "\n"
                + "\t" + "Model: " + getModel() + "\n"
                + "\t" + "Mileage: " + getMileage() + "\n"
                + "\t" + "TowingCapacity: " + getTowingCapacity() + "\n"
                + "}";
    }
}
