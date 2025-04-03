public class IntArrayList implements IntList{

    private int[] array;
    private int size;

    public IntArrayList() {
        array = new int[10];
        size = 0;
    }
    @Override
    public void add(int value) {
        if(size == array.length) {
            int[] newArray = new int[array.length + array.length/2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    @Override
    public int get(int id) {
        if(id >= size|| id < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[id];
    }
}
