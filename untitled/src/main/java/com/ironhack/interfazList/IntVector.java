package com.ironhack.interfazList;

import java.util.Arrays;

public class IntVector implements IntList {
    private int[] arr;
    private int size;

    public IntVector() {
        arr = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == arr.length) {
            int newSize = arr.length *2;
            arr = Arrays.copyOf(arr, newSize);
        }
        arr[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        return arr[id];
    }
    public int getSize() {
        return size;
    }

}
