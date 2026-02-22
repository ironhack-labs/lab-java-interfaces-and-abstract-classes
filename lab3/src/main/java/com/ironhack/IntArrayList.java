package com.ironhack;

public class IntArrayList implements IntList {
    public int[] currentList = new int[10];
    public int[] newList;
    public int length = 10;
    public int index = 0;


    public int get(int id){
        return currentList[id];
    }

    public void add(int number){
        if(index < length){
            currentList[index] = number;
            index++;
        }
        else {
            newList = new int[length + (length / 2)];
            System.arraycopy(currentList, 0, newList, 0, length);
            length += (length / 2);
            currentList = newList;
            currentList[index] = number;
            index++;
        }
    }
}
