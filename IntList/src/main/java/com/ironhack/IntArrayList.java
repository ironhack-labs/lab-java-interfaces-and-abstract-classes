package com.ironhack;

import java.util.ArrayList;

public class IntArrayList {

//IntArrayList should store numbers in an array with a length of 10 by default.
// When the add method is called, you must first determine if the array is full.
// If it is, create a new array that is 50% larger,
// move all elements over to the new array and add the new element.
// (For example, an array of length 10 would be increased to 15.)

    ArrayList<Integer> numbers = new ArrayList<>(10);

    public void addNumberToList(int number){
        if(numbers.size() == 10){
            ArrayList<Integer> newNumbers = new ArrayList<>((int)(numbers.size() * 1.5));
            for(int i = 0; i < numbers.size(); i++){
                newNumbers.add(numbers.get(i));
            }
            numbers = newNumbers;
        }
    }

}
