package IntListInterface;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntArrayList() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    private void increaseCapacity() {
        int newCapacity = array.length + (array.length / 2); // Increase by 50%
        int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size)
            throw new IndexOutOfBoundsException("Index " + id + ", Size " + size);
        return array[id];
    }
}
