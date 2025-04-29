package Task4;

public class IntVector implements iIntList {
    private int[] data;
    private int size;

    public IntVector() {
        this.data = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            int[] newData = new int[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        data[size++] = number;
    }

    @Override
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        return data[index];
    }
}
