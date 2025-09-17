package Cars;

public class Truck extends Car{
    double throwingCapacity;
    public Truck(String vNumber, String make, String model,int mileage, double throwingCapacity ){
        super(vNumber,make, model,mileage);
        this.throwingCapacity = throwingCapacity;
    }

    @Override
    public String getInfo(){
       return super.getInfo() + ", Throwing capacity: " + throwingCapacity+ " tones";
    }
}
