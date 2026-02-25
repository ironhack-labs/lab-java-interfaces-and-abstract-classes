package com.ironhack;

public class IntVector implements IntList{
    private int[] array2 = new int[20];
    private int size = 0;
    int k;

    @Override
    public void add(int number) {
        if ( array2.length == size ){
            int newArraySize =(array2.length * 2) ;  // double the size artirsin

            int [] newArray = new int [newArraySize] ;

            for (int k = 0; k <array2.length; k++){
                newArray[k] = array2 [k];
            }
            this.array2 = newArray;
            System.out.println("Array length is now: " + array2.length);
        }
        array2[size] = number;
        size++;  //array-e elave etsin
    }

    @Override
    public void get(int id) {
        if (id < 0 || id >= size) {
            System.err.println("Error:No element in " + id + "id.");
        } else {
            System.out.println("Element: " + array2[id]);
        }
    }


}
