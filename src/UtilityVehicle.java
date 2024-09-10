
////UtilityVehicle objects should have an additional fourWheelDrive property, a boolean that represents whether the vehicle has four-wheel drive.

public class UtilityVehicle extends Car{

    private boolean quattro;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean quattro) {
        super(vinNumber, make, model, mileage);
        this.quattro = quattro;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n Quattro (Yes/No): " + (quattro ? "Yes" : "No");
    }

    public boolean isQuattro() {
        return quattro;
    }
}
