package IntList_Interface;

public class IntArrayList implements IntList {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] data;
    private int size;
    public IntArrayList() {
        this.data = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }
    @Override
    public void add(int number) {
        ensureCapacity();
        data[size++] = number;
    }
    @Override
    public int get(int id) {
        return data[id];}

    private void ensureCapacity() {
        if (size < data.length) {
            return;
        }
        int newCapacity = data.length + (data.length / 2);
        int[] resized = new int[newCapacity];
        System.arraycopy(data, 0, resized, 0, data.length);
        data = resized;
    }



}