// Abstract base class for all cars
abstract class Car {
    public String vinNumber;
    public String make;
    public  String model;
    public  int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    // Abstract method to get car information
    public abstract String getInfo();
}

// Sedan class
class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "Sedan - VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage;
    }
}

// UtilityVehicle
class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "Utility Vehicle - VIN: " + vinNumber + ", Make: " + make + ", Model: " + model +
                ", Mileage: " + mileage + ", 4WD: " + fourWheelDrive;
    }
}

// Truck class
class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Truck - VIN: " + vinNumber + ", Make: " + make + ", Model: " + model +
                ", Mileage: " + mileage + ", Towing Capacity: " + towingCapacity;
    }
}

// Usage:
 public class Cars {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("123456", "Toyota", "Camry", 50000);
        System.out.println(sedan.getInfo());

        UtilityVehicle utilityVehicle = new UtilityVehicle("789012", "Jeep", "Wrangler", 75000, true);
        System.out.println(utilityVehicle.getInfo());

        Truck truck = new Truck("345678", "Ford", "F-150", 100000, 8000);
        System.out.println(truck.getInfo());
    }
}
