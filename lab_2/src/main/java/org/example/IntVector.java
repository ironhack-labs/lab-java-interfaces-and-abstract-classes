package org.example;

public class IntVector implements IntList {
    private int[] data;   // internal storage
    private int size;     // number of elements currently stored

    public IntVector() {
        data = new int[20];
        size = 0;
    }

    // Add element to the vector
    @Override
    public void add(int number) {
        if (size == data.length) {
            grow();
        }
        data[size++] = number;
    }

    // Get element at index
    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        else {
            return data[index];
        }
    }

    // Double array capacity
    private void grow() {
        int newCapacity = data.length * 2;
        int[] newData = new int[newCapacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

}