package com.ironhack;

public class IntArrayList implements IntList {
    private int[] arr = new int[10];
    private int size = 0;

    public void add(int number) {
        if (size == arr.length) {
            int[] newArr = new int[arr.length + arr.length / 2];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        arr[size] = number;
        size++;
    }

    public int get(int id) {
        return arr[id];
    }
}

