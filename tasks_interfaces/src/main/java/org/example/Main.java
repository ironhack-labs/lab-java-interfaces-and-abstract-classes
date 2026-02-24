package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import bigdecimal_operations.BigDecimalOperations;
import car_inventory.Sedan;
import car_inventory.Truck;
import car_inventory.UtilityVehicle;
import intlist_interface.IntArrayList;
import intlist_interface.IntList;
import intlist_interface.IntVector;
import video_streaming.Movie;
import video_streaming.TvSeries;

class Main{
    public static void main(String[] args){
        //1.BigDecimal operations test
        System.out.println("\n-----BigDecimal Operations test-----\n");
        BigDecimal num1=new BigDecimal("123.982");
        BigDecimal num2=new BigDecimal("128.541");
        System.out.println("\n-----Rounding to nearest hundredth-----");
        System.out.println("Before first number: "+num1+", After rounding to the nearest hundredth: "+BigDecimalOperations.roundingMethod(num1));
        System.out.println("Before second number: "+num2+", After rounding to the nearest hundredth: "+BigDecimalOperations.roundingMethod(num2));
        System.out.println("\n-----Reverse sign and rounding to nearest tenth-----");
        System.out.println("Before first number: "+num1+", After reverse sign and rounding to nearest tenth: "+BigDecimalOperations.signReverse(num1));
        System.out.println("Before second number: "+num2+", After reverse sign and rounding to nearest tenth: "+BigDecimalOperations.signReverse(num2));

        //2.Car Inventory System test
        System.out.println("\n-----Car Inventory System test-----\n");
        Sedan type_of_sedan=new Sedan("1FABP34W72FXXXXXX","Lexus", "Toyota Corolla",40);
        UtilityVehicle type_of_utility=new UtilityVehicle("2ABCP512W72FXXXXXX","Terrain", "Polaris Ranger",20,true);
        Truck type_of_truck=new Truck("3BWS89P70FXXXXXX","Volvo", "Cat8",60,9.200);
        System.out.println(type_of_sedan.getInfo());
        System.out.println(type_of_utility.getInfo());
        System.out.println(type_of_truck.getInfo());

        //3.Video Streaming Service test
        System.out.println("\n-----Video Streaming Service test-----\n");
        TvSeries test1=new TvSeries("Breaking Bad",45, 62);
        Movie test2=new Movie(" The Shawshank Redemption",142,9.3);
        System.out.println(test1.getInfo());
        System.out.println(test2.getInfo());


        //4.IntList Interface
        System.out.println("\n-----IntList Interface test-----\n");
        IntList myArrayList = new IntArrayList();
        System.out.println("Add elements to IntArray.... ");
        for (int i = 0; i <= 12; i++) {
            myArrayList.add(i * 10);
        }
        System.out.println("11th element of array: " + myArrayList.get(11));
        System.out.println("-------------------------");
        IntList myVector = new IntVector();
        System.out.println("Add elements to IntVector....");
        for (int i = 0; i <= 25; i++) {
            myVector.add(i);
        }
        System.out.println("24th element of array: " + myVector.get(24));
    }
}
