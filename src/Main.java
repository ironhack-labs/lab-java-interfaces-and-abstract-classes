package src;

import src.cars.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== BigDecimal Operations ======");
        System.out.println(BigDecimalWorkshop.toDouble(BigDecimal.valueOf(4.2550)));
        System.out.println(BigDecimalWorkshop.changeSignAndRound(BigDecimal.valueOf(1.2345)));
        System.out.println(BigDecimalWorkshop.changeSignAndRound(BigDecimal.valueOf(-45.67)));
        System.out.println("====== Car Inventory System ======");
        Car car = new Sedan("12345B", "Ford", "Fiesta", 123);
        System.out.println(car.getInfo());
    }
}
