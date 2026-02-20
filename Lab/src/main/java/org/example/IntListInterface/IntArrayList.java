package org.example.IntListInterface;

import java.math.BigDecimal;
import java.util.ArrayList;

public class IntArrayList implements IntList {
    private int[] data = new int[10];
    private int size = 0;

    @Override
    public void add(int number) {
        if(data.length == size) {
            int newDataLength = data.length + (data.length /2);
            int[] newData = new int[newDataLength];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
            data[size++] = number;
        }else{
            data[size++] = number;
        }
        System.out.println(data.length);
        System.out.println(size);
    }

    @Override
    public int get(int id) {
        if(id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Enter valid index");
        }
        return data[id];
    }
}
