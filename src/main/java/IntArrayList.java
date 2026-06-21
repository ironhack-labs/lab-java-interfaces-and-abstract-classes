import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] data;
    private int size;

    public IntArrayList() {
        this.data = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        ensureCapacity();
        data[size++] = number;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            int newLength = data.length + data.length / 2; // 50% larger
            data = Arrays.copyOf(data, newLength);
        }
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[id];
    }
}
