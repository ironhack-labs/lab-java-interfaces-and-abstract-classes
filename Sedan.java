public class Sedan extends Car{

    public Sedan(String make, String model, int mileage, int vinNumber){
        super(make,model,mileage,vinNumber);
    }

    public boolean getInfo() {
        System.out.println("VIN Number: " + getVinNumber());
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Mileage: " + getMileage());
        return false;
    }


}
