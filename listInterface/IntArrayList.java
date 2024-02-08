package listInterface;

public abstract class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList(){
        this.array = new int[10];
        this.size = 0;
    }
    @Override
    public void add(int number){
        if (size == array.length) {
            int[] newArray = new int[array.length * 3 / 2]; // Increase size by 50%
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }
    @Override
    public int get(int id){
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index " + id + " is out of bounds.");
        }
        return array[id];
    }
}
