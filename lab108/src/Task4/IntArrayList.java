package Task4;

public class IntArrayList implements iIntList {
    private int[] data;
    private int size;

    public IntArrayList() {
        this.data = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == this.data.length) {
            int newCapacity = this.data.length + this.data.length / 2;
            int[] newData = new int[newCapacity];
            System.arraycopy(this.data, 0, newData, 0, size);
            this.data = newData;
        }
        this.data[size++] = number;
    }

    @Override
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        return data[index];
    }
}
