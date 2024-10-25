public class Truck extends Car {

    private Double towingCapacity;

    public Truck(String make, int mileage, String model, Double towingCapacity) {
        super(make, mileage, model);
        this.towingCapacity = towingCapacity;
    }

    public Double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(Double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " and the towing capacity is  " +  towingCapacity;

    }
}
