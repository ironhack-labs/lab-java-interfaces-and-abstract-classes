package IntListInterface;

public class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        array = new int[20];
        size = 0;
    }

    @Override
    public void add(int number){
        if (size == array.length) {
            int newLength = array.length * 2;
            int[] newArray = new int[newLength];

            for (int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw  new IndexOutOfBoundsException("Invalid index");
        }
        return array[id];
    }
}
