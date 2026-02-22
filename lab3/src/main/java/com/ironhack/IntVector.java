package com.ironhack;

public class IntVector implements IntList {
    public int[] currentArray = new int[20];
    public int length = 20;
    public int[] newArray;
    public int index = 0;

    public void add(int number){
        if(index < length){
            currentArray[index] = number;
            index++;
        }
        else {
            newArray = new int[length*2];
            System.arraycopy(currentArray, 0, newArray, 0, length);
            length *= 2;
            currentArray = newArray;
            currentArray[index] = number;
            index++;
        }
    }

    public int get(int id){
        return currentArray[id];
    }
}
