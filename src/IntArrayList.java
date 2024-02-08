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
            int newLength = array.length + (array.length / 2);
            int[] newArray = new int[newLength];
            System.arraycopy(array, 0, newArray, 0, array.length); //
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        return array[id];
    }
}
