package com.ironhack.IntListInterface;

public class IntArrayList implements IntList{


    private int[] arrrayInt=new int[10];
    private int size=0;

    @Override
    public void add(int number) {
        if(size==arrrayInt.length){
             int newSize= (int) (arrrayInt.length*1.5);
            int[] newArrayint=new int[newSize];
            for(int i=0;i<size;i++){
                newArrayint[i]=arrrayInt[i];
            }
            arrrayInt=newArrayint;
        }
        arrrayInt[size++]=number;



    }

    @Override
    public int get(int id) {
        if(id<0 || id>=size){
            System.err.println("id out of range");
        }
        return arrrayInt[id];
    }
}
