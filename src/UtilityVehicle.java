public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive){
        super(vinNumber,make,model,mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean getFourWheelDrive(){return fourWheelDrive;}
    public void setFourWheelDrive(boolean fourWheelDrive){
        this.fourWheelDrive = fourWheelDrive;
    }
    @Override
    public String getInfo(){
        String boolWheels;
        if(fourWheelDrive){
            boolWheels = "yes";
        }else{
            boolWheels = "no";
        }
        return super.getInfo()+" four wheels: "+boolWheels ;
    }
}
