package IntListInterface;

public class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        this.array = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            resize(array.length * 2);
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
        int[] newArray = new int[(int)newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        this.array = newArray;
    }
}
