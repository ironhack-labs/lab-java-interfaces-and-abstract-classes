package com.ironhack.IntListInterface;

class IntArrayList implements IntList {

    private int[] numbers;
    private int size;

    public IntArrayList() {
        numbers = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == numbers.length) {
            int newLength = numbers.length + numbers.length / 2;
            int[] newArray = new int[newLength];

            System.arraycopy(numbers, 0, newArray, 0, numbers.length);

            numbers = newArray;
        }

        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException();
        }
        return numbers[id];
    }
}
