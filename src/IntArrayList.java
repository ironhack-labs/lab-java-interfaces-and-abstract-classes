public class IntArrayList implements IntList{
    public int[] array;
    private int size;
    private final double RESIZING_FACTOR = 0.5;
    private final int DEFAULT_CAPACITY = 10;

    public IntArrayList(){
        //int DEFAULT_CAPACITY = 10;
        array = new int[DEFAULT_CAPACITY];
        size = 0;

    }
    @Override
    public void add(int number) {
        //if the array is full
        if (size == array.length){
            //create a new array with 50% more capacity
            int newSize = (int) (array.length + array.length* RESIZING_FACTOR);
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, size);
            // Update the reference to the new array
            array = newArray;
        }
        array[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= array.length) {
            throw new IndexOutOfBoundsException("Index " + id + " out of bounds for size " + size);
        }
        return array[id];
    }
}
