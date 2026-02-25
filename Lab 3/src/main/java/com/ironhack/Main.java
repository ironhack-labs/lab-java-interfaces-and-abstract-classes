package com.ironhack;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        double num1;

        BigDecimal num = new BigDecimal("7.9421");
        BigDecimal number = new BigDecimal("25.7589");

        BigDecimal displayVal = num.setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal reversed = number.negate().setScale(1, RoundingMode.HALF_EVEN);

        System.out.println(displayVal);
        System.out.println(reversed);

        Truck mahmud = new Truck("99ME786","nese","Opel",100,89.3);
        System.out.println(mahmud.getInfo());
        Movie nese =  new Movie ("The Martian",1,6.7);
        nese.getInfo();
        System.out.println(nese.getInfo());
IntArrayList abc = new IntArrayList();
abc.add(5);
abc.add(6);
abc.get(0);
    }
}