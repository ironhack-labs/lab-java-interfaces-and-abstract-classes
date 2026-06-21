import java.util.Arrays;

public class IntVector implements IntList {
    private int[] data;
    private int size;

    public IntVector() {
        this.data = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        ensureCapacity();
        data[size++] = number;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            int newLength = data.length * 2;
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
