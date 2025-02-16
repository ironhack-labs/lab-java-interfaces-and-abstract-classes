package com.ironhack.lab108.intlist;

import java.util.Arrays;

public class IntArrayList implements IntList{
    private int[] defaultArray;

    public IntArrayList() {
        this.defaultArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public IntArrayList(int[] defaultArray) {
        this.defaultArray = defaultArray;
    }

    @Override
    public void add(int number) {
        int[] largerArray;
        int larger = ((defaultArray.length*50)/100);

        if (defaultArray.length > 0){
            // New Array 50% larger
            largerArray = new int[(defaultArray.length+larger)];
            System.arraycopy(defaultArray, 0, largerArray, 0, defaultArray.length);
            // Add the new element to the new Array
            largerArray[defaultArray.length] = number;
            System.out.println("Default Array Length: " + defaultArray.length);
            System.out.println("New Array 50% larger Length: " + largerArray.length);
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
