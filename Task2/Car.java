package Task2;

abstract class Car {
    String vinNumber;
    String make;
    String model;
    int mileage;

    String getInfo() {
        return "Car Vin number: " + vinNumber + "\nCar Maker: " + make +"\nCar Model: " + model +"\nCar Mileage: " + mileage;
    }
}
