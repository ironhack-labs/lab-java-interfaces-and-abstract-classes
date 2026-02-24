package car_inventory;
 public class Sedan extends Car{
        public Sedan(String vinNumber, String make, String model, int mileAge){
            super( vinNumber, make, model, mileAge);
        }
        public String getInfo(){
            return ("Sedan Info\n"+"Vin number is: "+getVinNumber()+", Make is: "+getMake()+", Model is: "+getModel()+", mileAge is: "+getMileAge()+"\n");
        }
    }

