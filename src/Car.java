abstract class Car {
    //Create an abstract class named Car and define the following properties and behaviors:
    //    vinNumber: a String representing the VIN number of the car
    //    make: a String representing the make of the car
    //    model: a String representing the model of the car
    //    mileage: an int representing the mileage of the car

    protected  String vinNumber;
    protected  String make;
    protected  String model;
    protected  int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;



    }

    public abstract String getInfo ();





}




