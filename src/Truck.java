public class Truck extends Car {
    private int towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, int i){
        super(vinNumber, make, model, mileage);
        this.towingCapacity =towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Towing Capacity: " + towingCapacity;
    }
}

