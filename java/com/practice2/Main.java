package com.practice2;
import com.practice2.list.IntArrayList;
import java.math.BigDecimal;

public class Main {
    public static void  main(String[]args){

        IntArrayList list = new IntArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        BigDecimal num = new BigDecimal("4.2545");

        System.out.println(BigDecimalUtils.round(num));
        System.out.println(BigDecimalUtils.changeSign(num));

    }

}
