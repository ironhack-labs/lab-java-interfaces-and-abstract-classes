package com.ironhack.IntListInterface;

public class IntVector implements IntList{


    private int[] vectorInt=new int[10];
    private int size=0;


    @Override
    public void add(int number) {
        if(size == vectorInt.length){
            int newSize= vectorInt.length*2;
            int[] newVectorInt = new int[newSize];
            for(int i=0;i<size;i++){
                newVectorInt[i]=vectorInt[i];
            }
            vectorInt = newVectorInt;
        }
        vectorInt[size++]=number;

    }

    @Override
    public int get(int id) {
        if(id<0 || id>size){
            System.err.println("id out of range");
        }
        return vectorInt[id];
    }
}
