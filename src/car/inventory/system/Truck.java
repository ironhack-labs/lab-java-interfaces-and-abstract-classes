package car.inventory.system;

public class Truck extends Car {

    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }


    @Override
    String getInfo() {
        return "Car:" + "\n" +
                "vinNumber='" + super.getVinNumber() + "\n" +
                "make='" + super.getMake() + "\n" +
                "model='" + super.getModel() + "\n" +
                "mileage=" + super.getMileage() + "\n" +
                "towingCapacity=" + getTowingCapacity()+ "\n";
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
