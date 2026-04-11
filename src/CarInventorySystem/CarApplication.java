package CarInventorySystem;

public class CarApplication {
    public static void main(String[] args){

        Car sedan = new Sedan ("WZZZADG30986DC45H", "Honda", "Civic", 150000);
        Car truck = new Truck ("1FTFWET4EFA88453", "Ford", "F-150", 289648, 14000);
        Car utility = new UtilityVehicle("J3T1AC12R8M1003HM76", "Toyota", "Rav4", 35699, true);


        sedan.getInfo();
        truck.getInfo();
        utility.getInfo();
    }
}
