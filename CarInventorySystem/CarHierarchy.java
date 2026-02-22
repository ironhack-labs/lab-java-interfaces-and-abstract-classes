/**
 * Abstract base class representing any type of car in the inventory system.
 * All cars share common properties: VIN number, make, model, and mileage.
 * Concrete subclasses (Sedan, UtilityVehicle, Truck) extend this class
 * and may add type-specific properties.
 */
abstract class Car {
    
    private final String vinNumber;
    private final String make;
    private final String model;
    private final int mileage;

    /**
     * Constructs a new Car with the specified properties.
     * All fields are final and immutable after construction.
     *
     * @param vinNumber unique Vehicle Identification Number (17 characters typically)
     * @param make      manufacturer of the vehicle (e.g., Toyota, Ford)
     * @param model     model name of the vehicle (e.g., Civic, F-150)
     * @param mileage   current mileage in kilometers
     */
    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make      = make;
        this.model     = model;
        this.mileage   = mileage;
    }

    /**
     * Returns a formatted string containing all common car properties.
     * Subclasses should override this method to include type-specific information.
     *
     * @return a readable string representation of the car's common properties
     */
    public String getInfo() {
        return String.format("VIN: %s | Make: %s | Model: %s | Mileage: %d km",
                             vinNumber, make, model, mileage);
    }

    // Getters – useful for future extensions (search, filtering, etc.)
    public String getVinNumber() { return vinNumber; }
    public String getMake()      { return make;      }
    public String getModel()     { return model;     }
    public int    getMileage()   { return mileage;   }
}

/**
 * Represents a standard passenger Sedan.
 * Inherits all properties from Car; no additional fields.
 */
class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    /**
     * Returns car information including the specific type "Sedan".
     *
     * @return formatted string with all properties + vehicle type
     */
    @Override
    public String getInfo() {
        return super.getInfo() + " | Type: Sedan";
    }
}

/**
 * Represents a Utility Vehicle (SUV, crossover, etc.).
 * Adds a four-wheel-drive indicator.
 */
class UtilityVehicle extends Car {

    private final boolean fourWheelDrive;

    /**
     * Constructs a UtilityVehicle with four-wheel-drive specification.
     *
     * @param vinNumber      unique VIN
     * @param make           manufacturer
     * @param model          model name
     * @param mileage        current mileage in km
     * @param fourWheelDrive true if the vehicle has 4WD / AWD
     */
    public UtilityVehicle(String vinNumber, String make, String model,
                          int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    /**
     * Returns car information including type and 4WD status.
     *
     * @return formatted string with all properties + type + 4WD info
     */
    @Override
    public String getInfo() {
        return super.getInfo() +
               " | Type: Utility Vehicle | 4WD: " + (fourWheelDrive ? "Yes" : "No");
    }

    public boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }
}

/**
 * Represents a pickup Truck.
 * Adds towing capacity in kilograms or pounds (depending on context).
 */
class Truck extends Car {

    private final double towingCapacity;

    /**
     * Constructs a Truck with specified towing capacity.
     *
     * @param vinNumber      unique VIN
     * @param make           manufacturer
     * @param model          model name
     * @param mileage        current mileage in km
     * @param towingCapacity maximum towing capacity (suggested unit: kg or lbs)
     */
    public Truck(String vinNumber, String make, String model,
                 int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    /**
     * Returns car information including type and towing capacity.
     * Capacity is shown with one decimal place.
     *
     * @return formatted string with all properties + type + towing info
     */
    @Override
    public String getInfo() {
        return super.getInfo() +
               String.format(" | Type: Truck | Towing: %.1f kg", towingCapacity);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }
}

/**
 * Demonstration of the car hierarchy and polymorphic behavior.
 */
public class CarHierarchy {

    public static void main(String[] args) {
        Car sedan = new Sedan("1HGCM82633A004352", "Honda", "Civic", 85000);
        Car suv   = new UtilityVehicle("5XYZG6789K1234567", "Toyota", "RAV4", 45000, true);
        Car truck = new Truck("1FTFW1ETXEKD98765", "Ford", "F-150", 120000, 12000.5);

        // Polymorphic calls – all use the overridden getInfo()
        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());

        // Optional: showing access to subclass-specific properties
        if (suv instanceof UtilityVehicle uv) {
            System.out.println("  → Has 4WD: " + uv.hasFourWheelDrive());
        }
        if (truck instanceof Truck t) {
            System.out.println("  → Towing capacity: " + t.getTowingCapacity() + " kg");
        }
    }
}