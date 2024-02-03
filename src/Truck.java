public class Truck extends Car{
    double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo(){
        return super.getInfo().substring(0, super.getInfo().length()-1) + ", Towing capacity: " + String.valueOf(getTowingCapacity()) + "}";
    }
}

