public class Truck extends Car {
    private double towingCapacity;
    public Truck (String vin, String make, String model, int mileage, double towingCapacity) {
        super(vin, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double isFourWheelDrive() {
        return towingCapacity;
    }

    public void setFourWheelDrive(double fourWheelDrive) {
        this.towingCapacity = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Towing Capacity: " + towingCapacity + " Lbs";
    }
}
