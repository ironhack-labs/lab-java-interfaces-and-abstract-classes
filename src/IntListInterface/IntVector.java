package IntListInterface;

import java.util.Arrays;

public class IntVector  implements IntList{
    private int[] data;
    private int size;

    public IntVector() {
        this.data = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = number;

    }

    @Override
    public int get(int id) {
        if ( id < 0 || id >= size ) {
            throw new IndexOutOfBoundsException("Index " + " out of bounds for size " + size);
        }
        return data[id];
    }

    public int size() {
        return size;
    }
}
