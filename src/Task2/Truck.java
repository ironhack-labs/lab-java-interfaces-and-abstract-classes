package Task2;

public class Truck extends Car {

   private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileAge, double towingCapacity) {
        super(vinNumber, make, model, mileAge);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
    public String getInfo() {
        return
                "VIN Number: " + getVinNumber() + ", " +
                        "Make: " + getMake() + ", " +
                        "Model: " + getModel() + ", " +
                        "Mileage: " + getMileAge()
                + ", " +  // Use this if getInfo() is overridden in the Car class.
                "Towing Capacity: " + getTowingCapacity();
    }

}
