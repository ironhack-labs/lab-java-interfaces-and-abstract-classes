public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return "UtilityVehicle{" +
                "fourWheelDrive=" + fourWheelDrive +
                '}';
    }

    public UtilityVehicle(String vinNumber, String make, String model, int mileage) {
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
