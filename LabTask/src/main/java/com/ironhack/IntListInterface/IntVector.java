package com.ironhack.IntListInterface;

class IntVector implements IntList {

    private int[] numbers;
    private int size;

    public IntVector() {
        numbers = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == numbers.length) {
            int newLength = numbers.length * 2;
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
