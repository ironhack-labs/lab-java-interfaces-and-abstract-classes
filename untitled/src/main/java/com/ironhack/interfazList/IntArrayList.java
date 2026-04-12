package com.ironhack.interfazList;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int size;
    private int[] arr;

    public IntArrayList() {
        arr = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == arr.length) {
            int newSize = arr.length + (arr.length / 2);
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

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
