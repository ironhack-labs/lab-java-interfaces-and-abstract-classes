package intlist;

import java.util.Arrays;

public class IntVector implements IntList {
    private int[] data;
    private int size;

    public IntVector() {
        data = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newSize = data.length * 2; // x2
            data = Arrays.copyOf(data, newSize);
        }
        data[size++] = number;
    }

    @Override
    public int get(int id) {
        return data[id];
    }
}
