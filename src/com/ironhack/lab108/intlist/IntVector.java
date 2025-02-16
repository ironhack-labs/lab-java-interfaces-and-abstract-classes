package com.ironhack.lab108.intlist;

import java.util.Arrays;

public class IntVector implements IntList{
    private int[] defaultArray;

    public IntVector() {
        this.defaultArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    }

    public IntVector(int[] defaultArray) {
        this.defaultArray = defaultArray;
    }
    @Override
    public void add(int number) {
        int[] largerArray;
//        System.out.println(defaultArray.length);
        int doubleSize = defaultArray.length*2;
//        System.out.println(doubleSize);
        if (defaultArray.length > 0){
            // Double size new Array
            largerArray = new int[doubleSize];
            System.arraycopy(defaultArray, 0, largerArray, 0, defaultArray.length);
            // Add the new element to the new Array
            largerArray[defaultArray.length] = number;
            System.out.println("Default Array Length: " + defaultArray.length);
            System.out.println("New Array Double Size Length: " + largerArray.length);
            System.out.println(Arrays.toString(largerArray));
        } else {
            System.out.println("The array is empty");
        }
    }

    @Override
    public void get(int id) {
        System.out.println("ID: " + id + " Element: " + defaultArray[id]);
    }

    public int[] getDefaultArray() {
        return defaultArray;
    }

    public void setDefaultArray(int[] defaultArray) {
        this.defaultArray = defaultArray;
    }
}
