package car_inventory;

public abstract class Car{
    private String vinNumber;
    private String make;
    private String model;
    private int mileAge;
    public abstract String getInfo();
    public Car(String vinNumber, String make, String model, int mileAge){
        this.vinNumber=vinNumber;
        this.make=make;
        this.model=model;
        this.mileAge=mileAge;
    }
    public String getVinNumber(){
        return this.vinNumber;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getMileAge(){
        return this.mileAge;
    }
    public void setVinNumber(String vinNumber){
        this.vinNumber=vinNumber;
    }
    public void setMake(String make){
        this.make=make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setMileAge(int mileAge){
        this.mileAge=mileAge;
    }
}
