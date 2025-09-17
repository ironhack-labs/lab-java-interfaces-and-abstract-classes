package Cars;

public class UtilityVehicle extends Car{
    boolean fourWheelDrive;

    public UtilityVehicle (String vinNunber, String make, String model, int mileage, boolean fourWheelDrive){
        super(vinNunber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ", 4WD: " +fourWheelDrive;
    }
}
