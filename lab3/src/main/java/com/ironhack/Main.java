package com.ironhack;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    //Task 1a
    public static double roundToHundreth(BigDecimal myNum){
        BigDecimal roundedBigDecimal = myNum.setScale(2, RoundingMode.HALF_UP);
        double roundedDouble = roundedBigDecimal.doubleValue();
        return roundedDouble;
    }
    //Task 1b
    public static BigDecimal negativeRoundToTenth(BigDecimal myNum){
        return myNum.negate().setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        //Testing Task 1a
        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println(roundToHundreth(num1));

        //Testing Task 1b
        BigDecimal num2 = new BigDecimal("-45.67");
        System.out.println(negativeRoundToTenth(num2));

        //Testing Task 2
        Sedan sedan = new Sedan("BWM", "onnan", "oefg", 123123);
        System.out.print(sedan.getInfo());
        Truck truck = new Truck("BWM", "onnan", "oefg", 123123, 300.2);
        System.out.print(truck.getInfo());
        UtilityVehicle utility = new UtilityVehicle("BWM", "onnan", "oefg", 123123, true);
        System.out.print(utility.getInfo());

        //Testing Task 3
        Video video = new Movie("Titanic", 120, 4.5);
        System.out.print(video.getInfo());
        TvSeries series = new TvSeries("dwa", 34, 312);
        System.out.print(series.getInfo());

        //Testing Task 4
        IntArrayList vector = new IntArrayList();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        System.out.println(vector.get(10));
    }
}