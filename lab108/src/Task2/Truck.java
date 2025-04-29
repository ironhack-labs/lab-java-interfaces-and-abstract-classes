package Task2;

public class Truck extends Car{

    public double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "These are the properties of Truck: " + this.vinNumber + this.make + this.model + this.mileage + this.towingCapacity;
    }
}
