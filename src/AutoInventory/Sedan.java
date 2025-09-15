package AutoInventory;

public class Sedan extends Car{
    public Sedan(String VIN, String make, String model, int mileage) {
        super(VIN, make, model, mileage);
    }
    public void getInfo(){
        System.out.println("VIN: " + getVIN() + "\n" +"Make: " + getMake() + "\n" + "Model: "+
                getModel() + "\n" + "Mileage: " + getMileage());
    }
}