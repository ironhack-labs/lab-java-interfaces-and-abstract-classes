package com.IntList;

import java.util.Arrays;

public class IntVector implements IntList{
    private static final int DEFAULT_CAPACITY = 20;
    private int[] elements;
    private int size;


    public IntVector(){
        this.elements = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }


    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public void add(int element) {
        ensureCapacity();
        elements[size++] = element;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return elements[index];
    }
}
