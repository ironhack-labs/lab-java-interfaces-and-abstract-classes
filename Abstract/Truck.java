package Abstract;

public class Truck extends Car{
    private double towingCapacity;

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public Truck(String VinNumber, String make, String model, int mileage) {
        super(VinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "VIN: " + this.getVinNumber() + ", Make: " + this.getMake() + ", Model: " + this.getModel() + ", Mileage: " + this.getMileage() +", Towing Capacity: " + this.getTowingCapacity();
    }
}
