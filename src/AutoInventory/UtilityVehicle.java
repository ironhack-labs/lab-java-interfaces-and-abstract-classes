package AutoInventory;

public class UtilityVehicle extends Car{
    boolean isfourWheelDrive;
    public UtilityVehicle(String VIN, String make,String model, int mileage, boolean isfourWheelDrive){
        super(VIN, make, model, mileage);
        this.isfourWheelDrive = isfourWheelDrive;
    }
    public void getInfo(){
        System.out.println("VIN: " + getVIN() + "\n" +"Make: " + getMake() + "\n" + "Model: "+
                getModel() + "\n" + "Mileage: " + getMileage() + "\n" + "4-Wheel Drive: " + isFourWheelDrive());
    }
    public boolean isFourWheelDrive() {
        return isfourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.isfourWheelDrive = fourWheelDrive;
    }
}
