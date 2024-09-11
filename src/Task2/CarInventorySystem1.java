package Task2;

public class CarInventorySystem1 {

    public static void main(String[] args) {


        Car sedan=new Sedan("2356","Toyota", "A325", 35000);
        UtilityVehicle utilityVehicle=new UtilityVehicle("5623",
                "Mazda", "PO258", 45688, true);
        Car truck=new Truck("5956","Seat",
                "DF568", 98000, 45.566);

        System.out.println("Display all information: ");
        System.out.println("Sedan: " + sedan.getInfo());
        System.out.println("Utility Vehicle: " + utilityVehicle.getInfo());
        System.out.println("Truck: " + truck.getInfo());

    }
}
