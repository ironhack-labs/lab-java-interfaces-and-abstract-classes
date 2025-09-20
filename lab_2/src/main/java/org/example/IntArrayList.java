package org.example;

public class IntArrayList implements IntList {
    private int[] data;   // internal array to store elements
    private int size;     // number of elements currently stored

    // Default constructor -> array of length 10
    public IntArrayList() {
        data = new int[10];
        size = 0;
    }

    // Add element to the list
    @Override
    public void add(int number) {
        if (size == data.length) {
            grow();  // increase capacity by 50%
        }
        data[size++] = number;
    }

    // Get element by index
    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        else {
            return data[index];
        }
    }

    // Grow array capacity by 50%
    private void grow() {
        int newCapacity = data.length + data.length / 2; // 50% larger
        int[] newData = new int[newCapacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }


}
