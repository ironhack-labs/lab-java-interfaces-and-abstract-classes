package com.ironhack;

import java.util.Arrays;

public class IntVector {
// IntVector should store numbers in an array with a length of 20 by default.
// When the add method is called, you must first determine if the array is full.
// If it is, create a new array that is double the size of the current array,
// move all elements over to the new array and add the new element.
// (For example, an array of length 10 would be increased to 20.)

    private int[] numbers ;
    private int size;


    IntVector intVector = new IntVector();

    public void addNumberToIntVector(int number){
        if(size ==20){
            int[] newNumbers = new int[numbers.length * 2];
            for(int i = 0; i < numbers.length; i++){
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
    }




    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "IntVector{" +
                "numbers=" + Arrays.toString(numbers) +
                ", size=" + size +
                '}';
    }

}
