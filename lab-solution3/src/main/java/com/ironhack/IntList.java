package com.ironhack;

import java.util.Arrays;

/**
 * Interfaz y sus implementaciones con estrategias de crecimiento.
 */
public interface IntList {
    void add(int number);
    int get(int id);
}

class IntArrayList implements IntList {
    private int[] array = new int[10];
    private int size = 0;

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Crecimiento del 50%
            int newCapacity = array.length + (array.length / 2);
            array = Arrays.copyOf(array, newCapacity);
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) throw new IndexOutOfBoundsException();
        return array[id];
    }
}

class IntVector implements IntList {
    private int[] array = new int[20];
    private int size = 0;

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Crecimiento del 100% (doble)
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) throw new IndexOutOfBoundsException();
        return array[id];
    }
}