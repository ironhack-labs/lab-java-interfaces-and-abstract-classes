public abstract class car {

    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public car(String CarNumber, String Toyota, String SportClassic, int HundredKilometer
    )
    {

        this.vinNumber = CarNumber;
        this.make = Toyota;
        this.model = SportClassic;
        this.mileage = HundredKilometer;
    }
    // Abstract method that returns a String containing all car properties in a readable format;

    public abstract String getInfo();
    }

public static void main(String[] args) {

    class Sedan extends car {
        public Sedan(String vinNumber, String make, String model, int mileage) {
            super(vinNumber, make, model, mileage);
        }
        @Override
        public String getInfo() {
            return "\"vinNumber: \" + vinNumber + \" Make: \" + make + \", Model: \" + model + \", Mileage: \" + mileage;\n";
        }
    }
    }

   class utilityVehicle extends car {
    private boolean fourWheelDrive = true;

       public utilityVehicle(String vinNumber, String make, String model, int mileage) {
           super(vinNumber, make, model, mileage);
       }
       @Override
       public String getInfo() {
           if (fourWheelDrive) {
               return "fourWheelDrive";
           }
           return " \"vinNumber: \" + vinNumber + \" Make: \" + make + \", Model: \" + model + \", Mileage: \" + mileage;\n";
       }
   }


   class Truck extends car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }
       @Override
       public String getInfo() {
        if (towingCapacity == 0.0) {
            return "towingCapacity";
        }
           return "\"vinNumber: \" + vinNumber + \" Make: \" + make + \", Model: \" + model + \", Mileage: \" + mileage;\n";
       }
   }