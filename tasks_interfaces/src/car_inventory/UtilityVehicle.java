package car_inventory;
   public class UtilityVehicle extends Car{
        boolean fourWheelDrive;
        public UtilityVehicle(String vinNumber, String make, String model, int mileAge, boolean fourWheelDrive ){
            super( vinNumber, make, model, mileAge);
            this.fourWheelDrive=fourWheelDrive;

        }
        public boolean getFourWheelDrive(){
            return this.fourWheelDrive;
        }
        public String getInfo(){
            return ("Utility Vehicle Info\n"+"Vin number is: "+getVinNumber()+", Make is: "+getMake()+", Model is: "+getModel()+", mileAge is: "+getMileAge()+", Is four-wheel vehicle: "+getFourWheelDrive()+"\n");
        }
    }

