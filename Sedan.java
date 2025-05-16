public class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }


    @Override
    public String toString() {
        String stringOriginal = super.toString();
        return "Sedan, " + stringOriginal;
    }

    @Override
    public String getInfo() {
        String stringGetinfo = super.toString();
        return  "Sedan: " + stringGetinfo;
    }
}
