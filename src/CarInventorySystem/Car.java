package CarInventorySystem;

abstract class Car {
    private String vinNumber;
    private String Make;
    private String Model;
    private int Mileage;

    public Car(String vinNumber, String Make, String Model,int Mileage){
        this.vinNumber = vinNumber;
        this.Make = Make;
        this.Model = Model;
        this.Mileage = Mileage;
    }




    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public int getMilage() {
        return Mileage;
    }
    public void setMilage(int milage) {
        Mileage = milage;
    }
    public String getInfo(){
        return " Vin Number "+ getVinNumber()+" Make "+getMake()+" Model "+getModel()+" Mileage "+getMilage();
    }

}
