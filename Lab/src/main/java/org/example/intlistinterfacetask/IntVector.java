package org.example.intlistinterfacetask;

public class IntVector implements IntList{
    int[] numArr = new int[10];
    int size = 0;
    @Override
    public void add(int number) {
        if (size == numArr.length){
            int newArrLength = numArr.length * 2;
            int[] newArr = new int[newArrLength];
            for (int i = 0; i < numArr.length; i++) {
                newArr[i] = numArr[i];
            }
            numArr = newArr;
        }
        numArr[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        return numArr[id];
    }
}
