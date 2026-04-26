package com.practice2.list;
public class IntArrayList implements IntList{

    private int[] numbers = new int[10];
    private int size = 0;

    @Override
    public void add(int number){
        if (size == numbers.length){
            int newSize = numbers.length + (numbers.length / 2);
            int [] newArray = new int [newSize];
            System.arraycopy(numbers, 0, newArray, 0, size);
            numbers = newArray;
        }
        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id){
        return numbers[id];
    }
}
