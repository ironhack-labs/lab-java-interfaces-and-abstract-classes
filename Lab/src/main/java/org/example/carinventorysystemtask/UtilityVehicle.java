package org.example.carinventorysystemtask;

public class UtilityVehicle extends Car{

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage , boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }
    @Override
    public String getInfo(){
        return "VIN number: " + getVinNumber() + "\n" +
                "Make: " + getMake() + " \n" +
                "Model: " + getModel() + " \n" +
                "Mileage: " + getMileage() + "\n" +
                "Four-Wheel Drive: " + fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }
}
