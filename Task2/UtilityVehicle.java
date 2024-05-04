package Task2;

public class UtilityVehicle extends Car{
    boolean fourWheelDrive = true;

    @Override
    String getInfo() {
        var startingMessage = super.getInfo();
        return startingMessage + "\nFour Wheel Drive: " + fourWheelDrive;
    }
}
