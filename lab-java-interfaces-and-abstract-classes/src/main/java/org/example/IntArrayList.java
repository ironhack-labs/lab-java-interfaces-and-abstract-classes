package org.example;

import java.sql.Array;
import java.util.ArrayList;

public class IntArrayList implements IntList{
    int[] numbers = new int[10];
    int size = 0;

    @Override
    public void add(int number) {
        if (size < numbers.length){
            numbers[size] = number;
            size++;
        } else {
            int newSize = size + (size/2);
            int[] newNumbers = new int[newSize];
            newNumbers[newSize] = number;
            newSize++;
        }
    }

    @Override
    public int get(int id) {
        return 0;
    }
}
