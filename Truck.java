public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "towingCapacity=" + towingCapacity +
                '}';
    }

    public Truck(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getVinNumber() {
        return super.getVinNumber();
    }

    @Override
    public void setVinNumber(String vinNumber) {
        super.setVinNumber(vinNumber);
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public void setMake(String make) {
        super.setMake(make);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getMileage() {
        return super.getMileage();
    }

    @Override
    public void setMileage(int mileage) {
        super.setMileage(mileage);
    }
}
