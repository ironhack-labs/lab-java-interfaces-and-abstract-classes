package CarInventorySystem;

public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {

        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {

        this.towingCapacity = towingCapacity;
    }
    @Override
    public String getInfo(){
        return ("🔢Vin:" + getVinNumber() + "\nMake:" + getMake() + "\nModel:" + getModel() + "\nMileage:" + getMileage() + " km" + "\nTowing Capacity:" + getTowingCapacity() + " kg");
    }

}
