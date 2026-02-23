package org.example;

import java.util.ArrayList;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        array=new int[10];
        size=0;
    }

    @Override
    public void add(int number){
        if(size==array.length){
            int[] arrayNew=new int[(int)(array.length*1.5)];
            for(int i=0;i<array.length;i++){
                arrayNew[i]=array[i];
            }
            array=arrayNew;
        }
        array[size]=number;
        size++;
    }
    @Override
    public int get(int id){
        if(id<0 || id>size){
            throw new IndexOutOfBoundsException("Invalid index: " + id);
        }
        return array[id];
    }
}
