package InitList;

public interface IntList {

    /*
    Create an InitList.IntList interface with the following methods:
    add(int number): a method that adds a new number to the list
    get(int id): a method that retrieves an element by its ID
    Create two implementations of InitList.IntList: InitList.IntArrayList and InitList.IntVector.
    InitList.IntArrayList should store numbers in an array with a length of 10 by default.
    When the add method is called, you must first determine if the array is full.
    If it is, create a new array that is 50% larger, move all elements over to the new array
    and add the new element. (For example, an array of length 10 would be increased to 15.)
    InitList.IntVector should store numbers in an array with a length of 20 by default. When the add method is called,
    you must first determine if the array is full. If it is, create a new array that is double the size of
    the current array, move all elements over to the new array and add the new element.
    (For example, an array of length 10 would be increased to 20.)
    In your README.md, include an example of when InitList.IntArrayList would be more efficient
    and when InitList.IntVector would be more efficient.
     */

    void add(int number);
    int get(int id);
}


