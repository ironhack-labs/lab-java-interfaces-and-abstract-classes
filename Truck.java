public class Truck extends Car{
    private double towingCapacity;

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity; // Initialize from parameter


    }

    @Override
    public String toString() {
        String stringOriginal = super.toString();
        String getInfo = "Truck, " + stringOriginal + ", Towing capacity: " + towingCapacity;
        return getInfo;
    }

    @Override
    public String getInfo() {
        String stringGetinfo = super.toString();
        return  "Truck: " + stringGetinfo;
    }


}

