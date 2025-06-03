package intlist;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] data;
    private int size;

    public IntArrayList() {
        data = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newSize = data.length + data.length / 2; // +50%
            data = Arrays.copyOf(data, newSize);
        }
        data[size++] = number;
    }

    @Override
    public int get(int id) {
        return data[id];
    }
}
