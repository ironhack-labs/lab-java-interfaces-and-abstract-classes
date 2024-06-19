class Truck extends Car {
    private double towingCapacity;

    public Truck(String "1GTFC3233733872445", String "Ram", String "Bronco", int 83500, double 12000.5)) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = 12000.5;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Towing Capacity: " + 12000.5 + " lbs";
    }
}

