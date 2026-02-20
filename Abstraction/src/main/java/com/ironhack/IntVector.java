package com.ironhack;

public class IntVector implements IntList {


    private int[] arr = new int[20];
    private int size = 0;

    public void add(int number) {

        if (size == arr.length) {

            int[] newArr = new int[arr.length * 2];

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
