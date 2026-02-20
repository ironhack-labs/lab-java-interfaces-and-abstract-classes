package org.example;

import org.example.BigDecimalOperations.BigDecimalTask;
import org.example.CarInventorySystem.Truck;
import org.example.CarInventorySystem.UtilityVehicle;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UtilityVehicle utilityVehicle = new UtilityVehicle("1234"
                ,"Porsche"
                ,"911TurboS"
                ,1200
                ,false);
        Truck truck = new Truck(
                "34567"
                ,"Kamaz"
                ,"asdasd"
                ,12323423
        ,2000
        );
        System.out.println(truck.getTowingCapacity());

        System.out.println(utilityVehicle.getInfo());

//        System.out.println(BigDecimalTask.nearestHundredth(BigDecimal.valueOf(4.2545)));
//        System.out.println(BigDecimalTask.reverseNearestTenth(BigDecimal.valueOf(1.2345)));;
//
    }
}