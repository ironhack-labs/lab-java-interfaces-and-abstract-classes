package InList;

import InList.InList;

public class IntVector implements InList {

    private int[] data;
    private int size;

    public IntVector() {
        this.data = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            // double capacity (e.g., 20 -> 40)
            int newCapacity = data.length * 2;

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