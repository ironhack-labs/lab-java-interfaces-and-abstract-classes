public class ex2 {
    public static void main(String[] args) {
        Sedan x = new Sedan("12321", "120", "ddd", 10);
        x.getInfo();
    }
}

abstract class Car{
    private String vinNumber;
    private String make;
    String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage){
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void getInfo(){
        System.out.println(
                "Vin Number: " + getVinNumber() + "\n" +
                "Make: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "mileage: " + getMileage()
        );
    }
}

class Sedan extends Car{
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }
}

class UtilityVehicle extends Car{
    private boolean fourWheelDrive;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

}

class Truck extends Car{
    private double towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}

