public class UtilityVehicle extends Car{
    public boolean fourWheelDrive;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive){
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }
    public boolean isFourWheelDrive(){
        return this.fourWheelDrive;
    }
    @Override
    public String getInfo(){
        return "Utility Vehicle: " + super.getInfo() + " Four Wheel Drive: " + fourWheelDrive;
    }
}
