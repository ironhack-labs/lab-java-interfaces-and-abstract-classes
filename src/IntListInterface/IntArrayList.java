package IntListInterface;

import java.util.Arrays;

public class IntArrayList implements IntList  {
    private int[] data;
    private int size;

    public IntArrayList() {
        this.data = new int[10];
        this.size = 0;

    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newLength = data.length + data.length / 2;
            data = Arrays.copyOf(data, newLength);
        }
        data[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index " + " out of bounds for size " + size);
        }
        return data[id];

    }

    public int size() {
        return size;
    }

}
