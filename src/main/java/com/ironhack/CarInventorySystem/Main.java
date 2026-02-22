package com.ironhack.CarInventorySystem;

import javax.swing.text.Utilities;

public class Main {
    public static void main(String[] args) {
        UtilityVehicle utilityVehicle =new UtilityVehicle("JTJHY7AX6H4012345","Toyota","Land Cruiser",45000,true);

        Sedan sedan =new Sedan("WBA3A5C56H1234567","BMW","3 Series",15000);

        Truck truck=new Truck("1FTFW1RG4L1234567","Ford","F-150",12000,5800.5);

        System.out.println("About suv---> "+utilityVehicle.getInfo());
        System.out.println("About sedan--> "+sedan.getInfo());
        System.out.println("About truck--> "+truck.getInfo());

    }
}
