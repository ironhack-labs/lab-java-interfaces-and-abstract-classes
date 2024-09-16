abstract class Car {

    private final String vinNumber;
    private final String make;
    private final String model;
    private final int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getInfo() {
        return "VIN Number: " + vinNumber + "\n Make: " + make + "\n Model: " + model + "\n Mileage in kilometers: " + mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public static void main(String[] args) {

        Sedan sedan = new Sedan("ASDAS54844654ASD", "Mazda ", "3", 20000);
        Truck truck = new Truck("4134FSFG564S6FD5", "Tesla", "Truck ", 10000, 2000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("1243adasd", "Toyota", "Hillux", 8000,false);

        System.out.println("Sedan: \n" + sedan.getInfo());
        System.out.println("Truck: \n" + truck.getInfo());
        System.out.println("Utility vehicle: \n" + utilityVehicle.getInfo());

    }
}