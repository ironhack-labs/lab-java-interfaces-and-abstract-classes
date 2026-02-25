package com.ironhack;

public class IntArrayList implements IntList{
    private int[] array = new int[10];
    private int size = 0;
    int i;

    @Override
    public void add(int number) {
        if ( array.length == size ){
            int newArraySize =(array.length /2) * 3;  // 50% artirsin

            int [] newArray = new int [newArraySize] ;

            for (int i=0 ; i<array.length;i++){
                newArray[i] = array [i];
            }
            this.array = newArray;
            System.out.println("Array length is now: " + array.length);
        }
        array[size] = number;
        size++;  //array-e elave etsin
    }

    @Override
    public void get(int id) {
        if (id < 0 || id >= size) {
            System.err.println("Error:No element in " + id + "id.");
        } else {
            System.out.println("Element: " + array[id]);
        }
    }
}
