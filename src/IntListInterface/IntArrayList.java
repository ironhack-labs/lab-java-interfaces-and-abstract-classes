package IntListInterface;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            resize(array.length * 1.5);
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);
        }
        return array[id];
    }

    private void resize(double newSize) {
        int[] newArray = new int[(int) newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        this.array = newArray;
    }
}