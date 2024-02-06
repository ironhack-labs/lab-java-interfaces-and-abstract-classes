public class Sedan extends Car{


    public Sedan (String vinNumber, String make, String model, int mileage) {

        super(vinNumber, make, model, mileage);

    }

    //FUNCTIONS
    public String getInfo(){
        String info;
        info = "Sedan information\nVIN number: " + getVinNumber() + "\n" + "Make: " +
                getMake() + "\n" + "Model: " + getModel() + "\n" + "Mileage: " + getMileage() + "\n";
        return (info);
    }

}
