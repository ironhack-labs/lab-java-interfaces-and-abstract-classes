public class Truck extends Car {


        //Attributes
        private double towingCapacity;

        //constructor
        public Truck(String make, String model, int mileage,int vinNumber, double towingCapacity) {
            super(make,model,mileage, vinNumber);
            this.towingCapacity = towingCapacity;
        }


        // getters

        public double getTowingCapacity() {
            return towingCapacity;
        }

    public boolean getInfo() {
        System.out.println("VIN Number: " + getVinNumber());
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Mileage: " + getMileage());
        System.out.println("Towingcapacity: " + getTowingCapacity() ) ;
        return false;
    }



}





