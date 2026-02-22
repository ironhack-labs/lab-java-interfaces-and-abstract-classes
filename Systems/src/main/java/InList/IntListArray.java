package InList;

import java.lang.reflect.Array;

public class IntListArray implements InList{
    private int[] data;
    private int size;

    public IntListArray() {
        this.data = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            // grow by 50% (e.g., 10 -> 15)
            int newCapacity = data.length + (data.length / 2);
            if (newCapacity == data.length) {
                // defensive: if length were 1, length/2 would be 0
                newCapacity = data.length + 1;
            }

            int[] newData = new int[newCapacity];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }

        data[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException(
                    "id=" + id + " out of bounds (size=" + size + ")"
            );
        }
        return data[id];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return data.length;
    }
}

