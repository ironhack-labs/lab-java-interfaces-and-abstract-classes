package CarInventorySystem;

public class Truck extends Car{

    public Truck (String vinNumber, String make, String model, int mileage, double towingCapacity ) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity =towingCapacity ;
    }

    @Override
    String getInfo() {
        return "Truck{" +
                "towingCapacity =" + towingCapacity  +
                ", vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
    double towingCapacity ;
}