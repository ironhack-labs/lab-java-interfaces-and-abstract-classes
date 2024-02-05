public class UtilityVehicle extends Car{

    boolean fourWheelProperty;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelProperty) {
        super(vinNumber, make, model, mileage);
        setFourWheelProperty(fourWheelProperty);
    }

    public void setFourWheelProperty(boolean fourWheelProperty) {
        this.fourWheelProperty = fourWheelProperty;
    }

    public boolean getFourWheelProperty() {
        return fourWheelProperty;
    }

    @Override
    public String getInfo(){
        return super.getInfo().substring(0, super.getInfo().length()-1) + ", Has 4 wheels: " + String.valueOf(getFourWheelProperty()) + "}";
    }
}
