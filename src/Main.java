package src;

import src.cars.*;
import src.integers.IntArrayList;
import src.video.*;
import src.integers.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== BigDecimal Operations ======");
        System.out.println(BigDecimalWorkshop.toDouble(BigDecimal.valueOf(4.2550)));
        System.out.println(BigDecimalWorkshop.changeSignAndRound(BigDecimal.valueOf(1.2345)));
        System.out.println(BigDecimalWorkshop.changeSignAndRound(BigDecimal.valueOf(-45.67)));
        System.out.println("====== Car Inventory System ======");
        Car car = new Sedan("12345B", "Ford", "Fiesta", 123);
        Car car2 = new UtilityVehicle("12345B", "BMV", "4x4", 300, true);
        Car car3 = new Truck("555663N", "Pegaso", "Perseus", 667, 2.1);
        System.out.println(car.getInfo());
        System.out.println(car2.getInfo());
        System.out.println(car3.getInfo());
        System.out.println("====== Video Streaming Service ======");
        Video movie = new Movie("Inception", 148, 4.9);
        System.out.println(movie.getInfo());
        Video tvSeries = new TvSeries("Game of Thrones", 60, 80);
        System.out.println(tvSeries.getInfo());
        System.out.println("====== IntList Interface ======");
        IntArrayList arrayList = new IntArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(14);
        arrayList.add(11);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2222);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.get(15));
    }
}
