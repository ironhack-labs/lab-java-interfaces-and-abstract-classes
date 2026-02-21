package org.example;

import java.util.Arrays;

public class IntArrayList implements IntList{
    private int[] array;
    private int size;

    public IntArrayList(){
        array = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if(size==array.length){
            int newArrayLength = (int) (array.length * 1.5);
            int[] newArray = new int[newArrayLength];
                for(int i=0;i<array.length;i++){
                    newArray[i]=array[i];
                }
                array = newArray;
        }
        array[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if(id>size || id<0){
            throw new IndexOutOfBoundsException("Index: " + id);
        } else {
            return id;
        }
    }
}
