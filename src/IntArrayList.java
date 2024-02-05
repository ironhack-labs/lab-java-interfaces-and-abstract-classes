import java.sql.Array;
import java.util.ArrayList;

public class IntArrayList implements IntList {
    // should store numbers in an array with a length of 10 by default.
    // When the add method is called, you must first determine if the array is full.
    // If it is, create a new array that is 50% larger, move all elements over to the new array
    // and add the new element. (For example, an array of length 10 would be increased to 15.)

    private int[] arrayInts;
    private int capacity;
    private int filledPositions;

    public IntArrayList() {
        setCapacity(capacity);
        setFilledPositions(filledPositions);
        setArrayInts(getCapacity());
    }
    private void setArrayInts(int capacity) {
        this.arrayInts = new int[capacity];
    }

    private void setCapacity(int capacity) {
        this.capacity = 10;
    }
    private void setFilledPositions(int filledPositions) {
        this.filledPositions = 0;
    }

    public int[] getArrayInts() {
        return arrayInts;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFilledPositions() {
        return filledPositions;
    }

    public void add(int number) {
        if (filledPositions == capacity) {
            int oldCapacity = getCapacity();
            int[] oldArrayInts = getArrayInts();
            this.capacity = getCapacity() + getCapacity() / 2;
            int[] newArrayInts = new int[capacity];

            System.arraycopy(oldArrayInts, 0, newArrayInts, 0, oldArrayInts.length);
            newArrayInts[oldArrayInts.length] = number;
            this.arrayInts = newArrayInts;
            this.filledPositions = oldCapacity + 1;
        } else {
            this.arrayInts[filledPositions] = number;
            this.filledPositions = filledPositions + 1;
        }
    }

    public int get(int id) {
        return arrayInts[id];
    }
}
